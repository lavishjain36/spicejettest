package Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.BaseClass;
import utilities.ExtentReport;

public class Listeners extends BaseClass implements ITestListener {
	
WebDriver driver=null;
ExtentReports extentReport=ExtentReport.getExtentReport();
ExtentTest extentTest;


//method which invoked before each test method execution
@Override
public void onTestStart(ITestResult result) {
	extentTest=extentReport.createTest(result.getName());
}

//method which invoked before each test method sucessful.
@Override
public void onTestSuccess(ITestResult result) {
	//log the status 
	extentTest.log(Status.PASS, "Test Passed");
}

//Invoked each time a test fails.
@Override
public void onTestFailure(ITestResult result) {
	extentTest.fail(result.getThrowable());
	//get the name of failed test case
	String testName=result.getName();
	//Logic for screenshot capture
	try {
		driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
	} catch (IllegalAccessException|IllegalArgumentException|NoSuchFieldException|SecurityException e) {
		e.printStackTrace();
	}
	try {
		String screenshotPath=takeScreenshot(testName, driver);//calling method coming utilitu class in utilties
		extentTest.addScreenCaptureFromPath(screenshotPath,testName);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}

@Override
public void onFinish(ITestContext context) {
	//flush the extent  to write the data to report file
	extentReport.flush();
}

}
