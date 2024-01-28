package StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import generic.BrowserProvider;
import io.cucumber.java.en.*;

public class OhrmDDTSteps {
	
	//WebDriver driver=BrowserProvider.getDriver();
	WebDriver driver;
	@Given("Open orangehrm application")
	public void open_orangehrm_application() 
	{
	   //driver=new EdgeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User enter username {string} and enter password {string}")
	public void user_enter_username_and_enter_password(String uname, String psw)
	{
	   
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(psw);
	}

	@When("User Click on hrm login buttton")
	public void user_click_on_hrm_login_buttton() 
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("As per valid data user should be able to login")
	public void as_per_valid_data_user_should_be_able_to_login() 
	{
		String exp="dashboard";
		Assert.assertTrue(driver.getCurrentUrl().contains(exp));
		System.out.println("Login Completed");
	}

}
