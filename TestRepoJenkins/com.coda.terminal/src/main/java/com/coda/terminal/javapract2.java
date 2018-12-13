package com.coda.terminal;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class javapract2 {

	public static void main(String[] args) throws AWTException, MalformedURLException{
		
		
		System.out.println("Successfully started executing the script");
		
		URL local = new URL("http://abcd:4444/wd/hub");
		
		 WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
			
			
			
			//driver.manage().window().maximize();
			
			driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
			
			String TitleName = driver.getTitle();
			
			System.out.println("Script passed: " +TitleName+ " launched successfully" );	
			
			driver.quit();
			
			
			
	}

	
}