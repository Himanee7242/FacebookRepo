package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpForm 
  {

	@FindBy (xpath = "(//input[@type='text'])[2]")
	private WebElement Firstname ;

	@FindBy (xpath = "(//input[@type='text'])[3]")
	private WebElement Lastname ;

	@FindBy (xpath = "//input[@aria-label='Mobile number or email address']")
	private WebElement mobileno;
  
	@FindBy (xpath = "(//input[@type='password'])[2]")
	private WebElement  password2;

	@FindBy (xpath = "(//input[@type='radio'])[1]")
	private WebElement femaleRadioButton ;
	
	@FindBy (xpath = "//select[@aria-label='Month']")
	private WebElement month ;
	
	@FindBy (xpath = " //select[@aria-label='Day']")
	private WebElement day ;
	
	@FindBy (xpath = "//select[@aria-label='Year']")
	private WebElement year ;
	
	@FindBy (xpath = "//input[@data-testid='royal_pass']")
	private WebElement password ;
	
	public SignUpForm (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
  
	public void sendFirstname() 
	  {
		Firstname.sendKeys("himanee");
	  }
	public void sendLastname ()
	  {
		Lastname.sendKeys("Suryawanshi");
	  }
	public void sendMobno()
	  {
		mobileno.sendKeys("8421403660");
	 }
	public void sendpassword()
	  {
		password.sendKeys("1234");
	 }
	public void clickFemaleRadioButton()
	{
	 femaleRadioButton.click();
	}
	public void dayDropdown()
	{
		Select s = new Select(day);
		s.selectByValue("14");
	}
	public void monthDropdown()
	{
	 Select s = new Select(month);
	 s.selectByIndex(4);
	}
	public void yearDropdown()
	{
		Select s = new Select(year);
		s.selectByValue("1997");
	}
  
  }
