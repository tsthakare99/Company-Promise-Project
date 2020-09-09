package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PromisesSearchPage {
	
WebDriver driver;
	

	@FindBy(id = "cboEmp")
	public WebElement Promisee;
	
	@FindBy(name = "btnSearch" )
	public WebElement SearchButton;
	
	public PromisesSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchPromise (String EmpName) {
		Select promiseSelect = new Select(Promisee);
		promiseSelect.selectByVisibleText(EmpName);
		
		SearchButton.click();
		
	}

	

}
