package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class LoginPage extends Utility{

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//div[.='Login'])[1]")
	WebElement loginkey;
	
	@FindBy(xpath="(//div[.='Email'])[1]")
	WebElement emailbutton;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement enteremailid;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement enterpassword;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement enterinvalidpassword;
	
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement loginbutton;
	
	
	
	public void Login() {
		loginkey.click();
	}
	
	public void EmailButton() {
		emailbutton.click();
	}
	
	public void EmailId(String Emailid) {
		enteremailid.sendKeys(Emailid);
	}
	
	public void Password(String Password) {
		enterpassword.sendKeys(Password);
	}
	
	public void invalidPassword(String InvalidPassword) {
		enterinvalidpassword.sendKeys(InvalidPassword);
	}
	public void LoginButton() {
		loginbutton.click();
	}
}
