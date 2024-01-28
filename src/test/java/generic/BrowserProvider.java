package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserProvider {
	
	static WebDriver driver;
	public static WebDriver setBrowser(String bname)
	{
		if(bname.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(bname.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		return driver;
	}
	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
