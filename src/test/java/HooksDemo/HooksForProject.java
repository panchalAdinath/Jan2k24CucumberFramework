package HooksDemo;

import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;

import generic.BrowserProvider;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class HooksForProject {
	/* Hooks will use to setup precondition and postcondition*/
	public WebDriver driver;
	@Before
	public void setApp()
	{
		BrowserProvider br=new BrowserProvider() ;
		br.setBrowser("edge");
	}
	
	
	@After
	public void tearDown()
	{
		
		driver.quit();
	}
	
	@AfterStep
	public void steps()
	{
		System.out.println(driver.getTitle());
	}
}
