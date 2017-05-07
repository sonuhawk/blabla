package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	
	static WebDriver driver;
	public static WebDriver browser(String browsername) 
	
	{
		if(browsername.equalsIgnoreCase("Firefox"))
		{
		driver = new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
			
			driver = new ChromeDriver();
			
			
		}
		return driver;
		
		
		
	}
	
	
	
	
	
	
	
	
}
