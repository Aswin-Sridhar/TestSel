package com.coda.terminal;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class javapract2 {

	public static void main(String[] args) throws AWTException, MalformedURLException{
		
		
		report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");

		System.out.println("Successfully started executing the script");
		//URL local = new URL("http://172.17.0.2:4444/wd/hub");//for local docker 
		
		URL local = new URL("http://127.0.0.1:4444/wd/hub");// http://127.0.0.1:4444/wd/hub for aws jenkins IP
		
		//URL local = new URL("http://172.17.0.3:4444/wd/hub");

		 WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
			
			
			
			//driver.manage().window().maximize();
			
			driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
			
			String TitleName = driver.getTitle();
			
			if(driver.getTitle().contains("IRCTC"))
			{
				test.log(LogStatus.PASS, "Navigated to "+ TitleName);
				}
				else
				{
				test.log(LogStatus.FAIL, "Test Failed");
				}
			
			report.endTest(test);
			report.flush();
			
			System.out.println("Script passed: " +TitleName+ " launched successfully" );	
			
			driver.quit();
			
			
			
	}

	
}
