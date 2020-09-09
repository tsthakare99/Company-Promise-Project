package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddPromisePage {

	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"frmLogPromise\"]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/select")
	public WebElement PromisesFromDrpDwn;

	@FindBy(id = "txtPromise")
	public WebElement Promisetxt;
	
	@FindBy(name = "btnSubmit" )
	public WebElement LogPromise;
	
	
	
	public AddPromisePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void FillPromiseDetails(String empName , String Promise) {
		Select promiseSelect = new Select(PromisesFromDrpDwn);
		promiseSelect.selectByVisibleText(empName);
		
		Promisetxt.sendKeys(Promise);
		
		LogPromise.click();
		
		
		//driver.navigate().back();
		
		
	}
}
