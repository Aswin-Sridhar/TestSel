package com.coda.terminal;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class App {

	public static void main(String[] args) throws AWTException, MalformedURLException {
	   
		//System.setProperty("webdriver.chrome.driver", "/Users/aswin/Documents/Eclipse_Workspace/demo/chromedriver");
		
//		System.setProperty("webdriver.chrome.driver", "/Users/Shared/Jenkins/chromedriver");
//		System.setProperty("webdriver.chrome.driver", "/Users/aswin/Downloads/chromedriver");
		//ChromeOptions chromeOptions= new ChromeOptions();

//		 URL local = new URL("http://localhost:9515");
//	        WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
	
	
	
		URL local = new URL("http://172.17.0.2:4444/wd/hub");
        WebDriver driver = new RemoteWebDriver(local, DesiredCapabilities.chrome());
		
		//driver.manage().window().fullscreen();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		System.out.println("class 2 executed successfully");
//		driver.findElementById("userRegistrationForm:userName").sendKeys("Test");
//		driver.findElementById("userRegistrationForm:password").sendKeys("Test1234");
//		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Test1234");
//		Select dd = new Select(driver.findElementById("userRegistrationForm:securityQ"));
//		dd.selectByIndex(4);
//		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("tennis");
//		driver.findElementById("userRegistrationForm:gender:0").click();
//		driver.findElementByLinkText("Submit Registration Form>>>").click();
		//driver.switchTo().alert();
//		Robot rb = new Robot();
//		rb.keyPress(KeyEvent.VK_ALT);
//		rb.keyPress(KeyEvent.VK_SPACE);
//		rb.keyPress(KeyEvent.VK_C);
//		rb.keyRelease(KeyEvent.VK_C);
//		rb.keyRelease(KeyEvent.VK_SPACE);
//		rb.keyRelease(KeyEvent.VK_ALT);
	}
}
