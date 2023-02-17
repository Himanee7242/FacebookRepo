package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUp_Page {
	// Variable -> private -> WebElement
	
	@FindBy (xpath = "//input[@ placeholder = 'Email address or phone number']")
		private WebElement username ;
	
	@FindBy (xpath = "//input[@data-testid='royal_pass']")
	private WebElement password ;
	
	@FindBy (xpath = "(//a[@role='button'])[2]")
	private WebElement createnewacc;
	
	//constructor-> public   WebElements initialization
	
	public LoginOrSignUp_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	methods -> public -> WebElement Action
	
	public void senduserName() 
	  {
		username.sendKeys("Himanee");
	  }
	public void sendpassword() 
	  {
		password.sendKeys("1234");
	  }
	public void clickCreatenewacc()
	  {
		createnewacc.click();
	 }

}
