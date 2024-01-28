package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class OCartSteps {
	
	WebDriver driver;
	@Given("Open cart application")
	public void open_cart_application() 
	{
		driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
	}

	@When("I enter valid email id {string}")
	public void i_enter_valid_email_id(String emailId) 
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailId);
	}

	@When("I enter valid password {string}")
	public void i_enter_valid_password(String psw) 
	{
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(psw);
	}

	@When("I click on cart login button")
	public void i_click_on_cart_login_button() 
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("I should get login and dashboard page should be open")
	public void i_should_get_login_and_dashboard_page_should_be_open() 
	{
		System.out.println("Validate login");
	    
	}

}
