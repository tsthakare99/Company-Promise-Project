package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	WebDriver driver;

	@FindBy(linkText="Log Promise")
     public WebElement LogPromise;

	@FindBy(xpath = ".//*[text()='Promises From']")
	public WebElement PromisesFrom;

	@FindBy(xpath = ".//*[text()='Promises To']")
	public WebElement PromisesTo;
	
	@FindBy(xpath = "/html/body/table/tbody/tr[1]/td/table/tbody/tr[1]/td[3]/table/tbody/tr[1]/td/a[3]")
	public WebElement Logout;
	
	
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addPromise() {
		
		LogPromise.click();
	}
	
	public void searchPromise() {
		
		PromisesTo.click();
	}
	
	public void logout() {
		
		Logout.click();
	}
	}
	
	
	
	


