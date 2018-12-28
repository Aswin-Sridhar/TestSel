package com.coda.SampleProj.SampleReports;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SampleClassTwo {

	@Test
	public void LaunchIRCTC() throws IOException{
		
		System.out.println("Script started executing");
		
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("Redbus", "Launch Redbus website");
		
		
			URL local = new URL("http://10.0.0.143:4444/wd/hub");
			WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
		
		//System.setProperty("webdriver.chrome.driver","/Users/aswin/Desktop/chromedriver");
		//ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		System.out.println("Redbus launched successfully");
		test.pass("Redbus launched successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img9.png").build());
		extent.flush();
		
		
		

		
	}

	
}
