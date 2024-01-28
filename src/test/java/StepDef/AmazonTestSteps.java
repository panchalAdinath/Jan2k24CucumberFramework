package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class AmazonTestSteps {
	
	WebDriver driver;
	@Given("Open Amazon application")
	public void open_amazon_application() 
	{
	  driver=new EdgeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	}

	@When("I capture title for home page")
	public void i_capture_title_for_home_page() 
	{
		System.out.println("Home page title: "+driver.getTitle());
	}

	@Then("Home page title should be match")
	public void home_page_title_should_be_match() 
	{
		Assert.assertTrue(driver.getTitle().contains("India"));
		System.out.println("Homepage title is matched..");
	}

	@When("I open BestSellers page")
	public void i_open_best_sellers_page() 
	{
		driver.findElement(By.linkText("Best Sellers")).click();
	}

	@When("I capture title for BestSellers page")
	public void i_capture_title_for_best_sellers_page() 
	{
		System.out.println("Best sellers page: "+driver.getTitle());
	}

	@Then("Best sellers page title should be match")
	public void best_sellers_page_title_should_be_match() 
	{
		Assert.assertTrue(driver.getTitle().contains("Bestsellers"));
		System.out.println("Title get matcehd for best sellers");
	}

	@When("I open mobiles page")
	public void i_open_mobiles_page() 
	{
		driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("I capture title for mobiles page")
	public void i_capture_title_for_mobiles_page() 
	{
		System.out.println("Title of mobiles page: "+driver.getTitle());
	}

	@Then("mobiles page title should be match")
	public void mobiles_page_title_should_be_match() 
	{
		Assert.assertTrue(driver.getTitle().contains("Mobile Phones"));
		System.out.println("Mobiles page title get matched");
	}

//	@When("I open Fashion page")
//	public void i_open_fashion_page() 
//	{
//	
//	}
//
//	@When("I capture title for Fashion page")
//	public void i_capture_title_for_fashion_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Fashion page title should be match")
//	public void fashion_page_title_should_be_match() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}
