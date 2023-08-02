package utilities;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	
	public static WebDriver driver;
	public Properties prop;
	public WebDriver intializeDriver() throws IOException {
		prop=new Properties();
		String propath=System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
//		String propath=System.getProperty("D:\\JavaConcept\\SpicejetProject\\src\\main\\java\\resources\\data.properties");
		FileInputStream fis=new FileInputStream(propath);
		prop.load(fis);
		
		String browsername = "chrome";
		if(browsername.equals("chrome")) {
			//load only chrome driver 
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}else if(browsername.equals("safari")) {
			WebDriverManager.safaridriver().setup();
			driver=new SafariDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));				
		return driver;
		
	}
	
	//common utility function to for capturing screenshot 

	public String takeScreenshot(String testName,WebDriver driver) throws IOException {
		//capture the screenshot and store it inf file objects
		File srcScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//define the path where screenshpt will be saved  
		String screenShotFilepath=System.getProperty("user.dir")+"\\Screenshots\\"+testName+".jpg";
		FileUtils.copyFile(srcScreenshot, new File(screenShotFilepath));
		return screenShotFilepath;

		
	}
	
	
	public static void SwitchWindow() {
		String parentwindow=driver.getWindowHandle();
		Set<String> windowhandles=driver.getWindowHandles();
		windowhandles.size();
		
		for(String childwindow:windowhandles) {
			if(!childwindow.contentEquals(parentwindow)) {
				driver.switchTo().window(childwindow);
				break;
			}
		}
	}
	
	
	

	
}
