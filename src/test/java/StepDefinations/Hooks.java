package StepDefinations;


import java.io.IOException;
import java.net.MalformedURLException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
    public static WebDriver driver;

    
    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void openBrowser() throws MalformedURLException {
    	System.out.println("Browser Started");
    	
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
    	driver = new ChromeDriver();
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    }

     
    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) throws IOException {
       
        if(scenario.isFailed()) {
        try { 
        	
        	
        	scenario.write("Scenario Failed");
        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
        	
        	  //TakesScreenshot screenshot = (TakesScreenshot)driver;
        	 // File screen = screenshot.getScreenshotAs(OutputType.FILE);
        	   // FileUtils.copyFile(screen, new File("D:\\screenshot.jpg"));
        	    //System.out.print("Failed Screenshot is captured and stored in your D: Drive");
        	 
        	 byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshot, "image/png");

        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        
        }
        driver.quit();
        
    }
    
}