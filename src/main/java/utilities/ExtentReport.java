package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	//method to create  for extentreport
	public static ExtentReports getExtentReport() {
		//define a path where extent report should be generated
		String extentReportPath=System.getProperty("user.dir")+"\\reports\\extentreport.html";
		
		//create an object of ExtentSparkReport  object specified 
		ExtentSparkReporter reporter=new ExtentSparkReporter(extentReportPath);
		
		//set the report name and document title for generated
		reporter.config().setReportName("Spicejet Automation Result");
		reporter.config().setDocumentTitle("Spicjet Automation Test Results");
		
		//create an object of ExtentReports obj 
		ExtentReports extentReport=new ExtentReports();
		//attach that report
		extentReport.attachReporter(reporter);
		
		
		return extentReport;
		
	}
}
