package com.coda.demo;

import java.net.URL;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class RemoteDriver {

	public static void main(String[] args) throws MalformedURLException {
		
		System.out.println("Successfully started executing the script");
		
		//For Remote webdriver

		URL local = new URL("http://localhost:4444/wd/hub"); 
		WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
	

		//For Using local driver

		// System.setProperty("webdriver.chrome.driver","/Users/aswin/Desktop/chromedriver");
		// ChromeDriver driver = new ChromeDriver();


		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");

		System.out.println("IRCTC launched successfully");
		
		driver.quit();
		

}
	}
