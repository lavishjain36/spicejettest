package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class SignupPage extends Utility {

	public WebDriver driver;
	//constructor to initialize page factory 
	public SignupPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locate an objects
	@FindBy(linkText="Signup")
	WebElement signup;
	
	@FindBy(xpath="//option[.='Mr']")
	WebElement title;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement country;
	
	@FindBy(xpath="//input[@id='dobDate']")
	WebElement dateofbirth;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobilenumber;
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='c-password']")
	WebElement confpassword;
	
	//method
	
	public void SignUp() {
		signup.click();
	}
	public void SelectTitle() {
		title.click();
	}
	
	public void Firstname(String FirstName) {
		firstname.sendKeys(FirstName);
	}

	
	public void Lastname(String LastName) {
		lastname.sendKeys(LastName);
	}
	

	public void getCountry() {
		country.click();
	}
	
	
	public void DateofBirth(String DOB) {
		dateofbirth.sendKeys(DOB);
	}
	
	public void Mobilenumber(String MobileNumber) {
		mobilenumber.sendKeys(MobileNumber);
	}
	
	public void Emailid(String Email) {
		email.sendKeys(Email);
	}
	
	public void EnterPassword(String Password) {
		password.sendKeys(Password);
	}
	
	public void ConfirmPass(String Confirmpassword) {
		confpassword.sendKeys(Confirmpassword);
	}
}
