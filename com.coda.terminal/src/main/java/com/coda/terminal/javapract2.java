package com.coda.terminal;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class javapract2 {

	public static void main(String[] args) throws AWTException, MalformedURLException{

		system.out.println("Successfully started executing the script")
		//URL local = new URL("http://172.17.0.2:4444/wd/hub");//for local docker 
		
		URL local = new URL("http://127.0.0.1:4444/wd/hub");// http://127.0.0.1:4444/wd/hub for aws jenkins IP
		
		 WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
			
			
			
			//driver.manage().window().maximize();
			
			driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
			
			System.out.println("Script passed : " +  driver.getTitle());
			
			driver.quit();
			
			
			
	}

	
}
