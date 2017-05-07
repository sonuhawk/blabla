package PageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_Page {

	
	/*  public WebDriver driver;
	public Login_Page(WebDriver driver)
	
	{
		this.driver=driver;
		
	}
	*/
	
	
	
	@FindBy(how=How.ID, using="email")
	public static WebElement email;
	
	@FindBy(how=How.ID, using="passwd")
	public static WebElement password;
	
	@FindBy(how=How.ID, using="SubmitLogin")
	public static WebElement signin_button;
	
	@FindBy(how=How.CLASS_NAME, using="logout")
	public static WebElement signou_button;
	
	
	
	
	
}
