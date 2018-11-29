package com.coda.demo;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DemoPract1 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Successfully started executing the script");
		System.setProperty("webdriver.chrome.driver","/Users/aswin/Desktop/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test = extent.createTest("Create Lead", "Create a new lead");
		test.pass("IRCTC launched successfully ", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img9.png").build());
		test.pass("Data crmsfa entered successfully like a boss ",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img9.png").build());
		test.pass("Login button is clicked like a boss");
		extent.flush();
		

}
	}
