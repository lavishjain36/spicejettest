package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Utility;

public class BaseClass extends Utility {
	

	@BeforeMethod
	public void startup() throws IOException {
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}

}
