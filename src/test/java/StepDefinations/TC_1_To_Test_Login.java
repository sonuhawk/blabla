package StepDefinations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Helpers.CreateLog;
import PageActions.Login_Page_Login;
import PageObjects.Login_Page;





public class TC_1_To_Test_Login {
	
	public static WebDriver driver;
	@When("^I open  website$")
	
	public static void OpenWebsite() throws Exception
	{
		
		driver = Hooks.driver;
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			//WebDriver driver = Browser.browser("chrome");
		PageFactory.initElements(driver, Login_Page.class);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		  CreateLog.info("Hello");
		
	}
	

	@Then("^I Enter Username$")
	public static void Enterusername() throws Exception
	{
		
		Login_Page_Login.Enterusername(driver);
	}
	
	@Then("^I ennter password$")
	public static void Enterpassword() throws Exception
	{
		Login_Page_Login.Enterpassword(driver);
	}
	
	@Then("^I Click submit$")
	
	public static void ClickSubmit() throws Exception
	{
		Login_Page_Login.ClickSubmit(driver);
	    
	}
	
	@Then("^I am on Homepage of website$")
	
	public static void verifyhomepage() throws Exception
	{
		
		Login_Page_Login.verifyhomepage(driver);
		
	    
	}
	
	    	 
	    	    	
	    	    	
	    	    	
	    	    	
	    	    	
	  
}

