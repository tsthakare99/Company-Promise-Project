package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.LoginPage;

public class CommonClass {

	WebDriver driver;
	
	public WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Tushar\\Selenium WebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		this.driver = driver;
		return driver;
	}
	
	public void getURL(String URL) {
		
		driver.get(URL);
	}
	
	

}
