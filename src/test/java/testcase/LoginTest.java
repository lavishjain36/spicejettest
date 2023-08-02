package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test(priority = 1)
	public void LoginwithValidCredentials() throws InterruptedException {
		LoginPage login=new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.Password(prop.getProperty("Password"));
		login.LoginButton();
		
	}

	
	@Test(priority = 2)
	public void LoginwithInvalidCredentials() throws InterruptedException {
		LoginPage login=new LoginPage(driver);
		login.Login();
		login.EmailButton();
		login.EmailId(prop.getProperty("Email"));
		login.invalidPassword(prop.getProperty("InvalidPass"));
		login.LoginButton();
	}
	
	
	
}
