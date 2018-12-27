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

public class AddReportDocker {
	
	@Test
	public void LaunchIRCTC() throws IOException{
		
		System.out.println("Script started executing");
		
		ExtentHtmlReporter html = new ExtentHtmlReporter("/reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("IRCTC", "Launch IRCTC website");
		
		
			URL local = new URL("http://54.187.105.230:4444/wd/hub");//changing abcd to http://54.187.105.230 for swarm experiment
			WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
		
		//System.setProperty("webdriver.chrome.driver","/Users/aswin/Desktop/chromedriver");
		//ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().fullscreen();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		System.out.println("IRCTC launched successfully");
		test.pass("IRCTC launched successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img9.png").build());
		extent.flush();
		
		
		

		
	}

}
