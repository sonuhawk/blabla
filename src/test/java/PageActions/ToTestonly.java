package PageActions;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import Helpers.CreateLog;
import Helpers.DataHelper;


public class ToTestonly {

	
	
	@Test
	public static void testusername() throws Exception{
		
		/*DataHelper.setExcelFile("D:\\Selenium\\Copy of Copy of PlantView-1\\src\\test\\resources\\testData\\default.xlsx", "Sheet1");
		
		String sPassword = DataHelper.getCellData(1, 2);
		String sUserName = DataHelper.getCellData(1, 1);
		System.out.println("username =" +sUserName);
		*/
		
		String log4jConfPath = "D:\\Selenium\\Copy of Copy of PlantView-1\\src\\test\\resources\\log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		Logger Logs = Logger.getLogger(ToTestonly.class.getName()); 
		
		Logs.info("Started Test case");

		
			
			
			

		}

}
