package com.bootcamp_test;

import java.awt.Desktop;
import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_Report {

	public static void main(String[] args) throws Exception {
		ExtentReports extentReports = new ExtentReports();
		File file = new File("report.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("C:\\Users\\Kmemo\\eclipse-workspace\\BootCaMP_Selenium_Maven\\report.html");
		extentReports.attachReporter(sparkReporter);
		
		ExtentTest test1 = extentReports.createTest("Test 1");
		 test1.pass("This is passed");
		 
		 ExtentTest test2 = extentReports.createTest("Test 2");
		 test1.log(Status.FAIL, "This is failled");
		 
		 ExtentTest test3 = extentReports.createTest("Test 3").skip("This is skipped");
		 
		 extentReports.flush();
		 Desktop.getDesktop().browse(new File("report.html").toURI());
		 
		 
		 

		 
		
		
	

	}

}
