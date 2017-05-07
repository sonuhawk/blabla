package PageActions;



import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;




import PageObjects.Login_Page;


import Helpers.CreateLog;
import Helpers.DataHelper;
public class Login_Page_Login {


	
	
public static void Enterusername(WebDriver driver) throws Exception{
		
	DataHelper.setExcelFile("D:\\Selenium\\Copy of Copy of PlantView-1\\src\\test\\resources\\testData\\default.xlsx", "Sheet1");
	
	String sUserName = DataHelper.getCellData(1, 1);
	
	
	 

		Login_Page.email.sendKeys(sUserName);

		CreateLog.info(" is entered in UserName text box" );
		
		
		
		

	}


public static void Enterpassword(WebDriver driver) throws Exception{
	
	DataHelper.setExcelFile("D:\\Selenium\\Copy of Copy of PlantView-1\\src\\test\\resources\\testData\\default.xlsx", "Sheet1");
	
	String sPassword = DataHelper.getCellData(1, 2);

	Login_Page.password.sendKeys(sPassword);
	CreateLog.info(" is entered in Password text box" );

	
}


public static void ClickSubmit(WebDriver driver) throws Exception{
	
	


	DataHelper.setExcelFile("D:\\Selenium\\Copy of Copy of PlantView-1\\src\\test\\resources\\testData\\default.xlsx", "Sheet1");
	
	Login_Page.signin_button.click();
	CreateLog.info("Click action is performed on Submit button");
	
	

	Reporter.log("SignIn Action is successfully perfomred");
	

	
	}
	
public static void verifyhomepage(WebDriver driver) throws Exception

{
	
	
	assertEquals("Sign out", Login_Page.signou_button.getText());
	
    
    	 DataHelper.setExcelFile("D:\\Selenium\\Copy of Copy of PlantView-1\\src\\test\\resources\\testData\\default.xlsx", "Sheet1");
 	    DataHelper.setCellData("passsing", 1, 3);
 	    
 	   System.out.print(driver.getTitle());
   

	
}






}
