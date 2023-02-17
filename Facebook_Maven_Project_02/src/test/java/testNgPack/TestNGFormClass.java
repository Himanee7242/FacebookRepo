package testNgPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browser.Browser;
import pomClasses.LoginOrSignUp_Page;
import pomClasses.SignUpForm;

public class TestNGFormClass extends Browser
	{
     WebDriver driver;
	@BeforeClass
	public void openBrowser(String browserName){
		if(browserName.equals("Chrome")) 
		{
		  driver=openChromeBrowser();
		}
		
		if(browserName.equals("Firefox")) 
		 {
			driver=openFirefoxBrowser();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
   }
	
	@BeforeMethod
	public void openSignUpPage() {
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
		
		LoginOrSignUp_Page loginOrSignUp_Page=new LoginOrSignUp_Page(driver);
		loginOrSignUp_Page.clickCreatenewacc();
	}
	
	@Test
	public void verifyFirstName() 
	 {
		System.out.println("Test-1");
		SignUpForm signUpForm = new SignUpForm(driver);
		signUpForm.sendFirstname();
}
	@Test
	public void verifyLastName() 
	 {
		System.out.println("Test-2");
		SignUpForm signUpForm = new SignUpForm(driver);
		signUpForm.sendLastname();
}
	@Test
	public void verifyMobileNo() 
	 {
		System.out.println("Test-3");
		SignUpForm signUpForm = new SignUpForm(driver);
		signUpForm.sendMobno();
}
	@Test
	public void verifyPassword() 
	 {
		System.out.println("Test-4");
		SignUpForm signUpForm = new SignUpForm(driver);
		signUpForm.sendpassword();
}	
	@Test
	public void verifyRadioButton() 
	 {
		System.out.println("Test-5");
		SignUpForm signUpForm = new SignUpForm(driver);
		signUpForm.clickFemaleRadioButton();
 }	
}