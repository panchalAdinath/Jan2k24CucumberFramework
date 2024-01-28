package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class SLabSteps {
	
	WebDriver driver;
	@Given("Open Swag Lab application is open")
	public void open_swag_lab_application_is_open() 
	{
	   driver=new EdgeDriver();
	   driver.get("https://www.saucedemo.com/v1/index.html");
	}

	@When("I enter username and password")
	public void i_enter_username_and_password() 
	{
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
	}

	@When("I click on login button")
	public void i_click_on_login_button() 
	{
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	@Then("I should be able to see my username")
	public void i_should_be_able_to_see_my_username() 
	{
		String title="Swag Labs";
		Assert.assertTrue(driver.getTitle().contains(title));
		System.out.println("User login successfully");
		driver.close();
		
	}
}
