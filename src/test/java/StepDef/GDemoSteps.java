package StepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import dev.failsafe.Timeout;
import generic.BrowserProvider;
import io.cucumber.java.en.*;

public class GDemoSteps {
	
	WebDriver driver;
	@Given("Open Google application")
	public void open_google_application() 
	{	
		
		//driver=new EdgeDriver();
		driver.get("https://www.google.com/");
	}

	@When("User capture title of google")
	public void user_capture_title_of_google() 
	{
		System.out.println("Title of webpage: "+driver.getTitle());
	    
	}

	@Then("Title should be Google")
	public void title_should_be_google() 
	{
		Assert.assertTrue(driver.getTitle().equals("Google"));
		System.out.println("Title get matched");
	}
	
	@When("User enter valid keyword in search")
	public void user_enter_valid_keyword_in_search() throws InterruptedException 
	{
		driver.findElement(By.name("q")).sendKeys("Java");
		Thread.sleep(2000);
	}

	@Then("User should get valid result")
	public void user_should_get_valid_result() throws InterruptedException
	{
		List <WebElement> list= driver.findElements(By.xpath("//div[@class='OBMEnb']//ul[@class='G43f7e']//li"));
		for(WebElement i:list)
		{
			System.out.println(i.getText());
			
		}
	}

}
