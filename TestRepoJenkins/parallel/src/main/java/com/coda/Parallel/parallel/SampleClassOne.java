package com.coda.Parallel.parallel;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class SampleClassOne {

	@Test

	public void LaunchIRCTC() throws IOException, InterruptedException{

		System.out.println("Script started executing");

		ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("IRCTC", "Launch IRCTC website");

		URL local = new URL("http://hub:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		Thread.sleep(10000);
		//driver.findElement("userRegistrationForm:userName").sendKeys("test bro");
		//driver.findElement(By.id("userRegistrationForm:userName")).sendKeys("test bro");
		System.out.println("IRCTC launched successfully");
		test.pass("IRCTC launched successfully", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img9.png").build());
		extent.flush();

		driver.quit();

	}


	}
