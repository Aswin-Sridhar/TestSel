package com.coda.demo;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class RemoteDriver {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Successfully started executing the script");
		
		URL local = new URL("http://127.0.0.1:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
		
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
