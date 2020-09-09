package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


		WebDriver driver;

		@FindBy(name="txtUsername")
         public WebElement userid;

		@FindBy(xpath = "//*[@name ='txtPassword']")
		public WebElement password;

		@FindBy(name = "submit1")
		public WebElement submit;

		public LoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public void loginToApplication(String Userid ,String Password) {
			userid.sendKeys(Userid);
			password.sendKeys(Password);
			submit.click();
		}
		
}