package com.execute;

import org.testng.annotations.Test;

import com.page.AddPromisePage;
import com.page.LoginPage;
import com.page.MainPage;
import com.page.PromisesSearchPage;
import com.utility.CommonClass;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class PromiseAppTest {
	
	
	WebDriver driver;
	CommonClass commonClass= new CommonClass();
	
	@BeforeClass
	  public void initialSetup() {
		driver = commonClass.openChromeBrowser();
		commonClass.getURL("http://182.74.238.221/clarion_promise_qa/home.php");
		
	  }
	
  @Test (priority=1 , dataProvider="PromiseData")
  public void LoginTest(String Userid,String Password,String EmpName,String Promise) {
	  LoginPage loginPage = new LoginPage(driver);
	  loginPage.loginToApplication(Userid, Password);
	  System.out.println("###############################################################");
	  // Login Scenario 1
	  Assert.assertFalse(driver.findElements(By.xpath(".//*[text()='Log Promise']")).size()==0,"Incorrect User Id and Password");
	  // Login Scenario 2
	
	  System.out.println("Userid and Password is correct");
	
  
  
  
  // 3 Add Promise details
	  MainPage mainPage = new MainPage(driver);
	 mainPage.addPromise();
	 
	 AddPromisePage addPromisePage = new AddPromisePage(driver);
	 addPromisePage.FillPromiseDetails(EmpName, Promise);
	 
	 System.out.println("promise Added successfully");
	 
  
  
  
  
		
		 // 4 Varify promise details
	
		  
		  PromisesSearchPage promisesSearchPage = new PromisesSearchPage(driver);
		  
		  promisesSearchPage.searchPromise(EmpName);
		  
		  
		  String AddedPromisexpath = ".//*[text()='"+Promise+"']";
		  
	 if (driver.findElements(By.xpath(AddedPromisexpath)).size()==0) {
		 
		System.out.println("Promise added but not varified");
		 }else { System.out.println("Promise Varified Successfully"); }
		 
		 
		//5  Log out from application
		 
		// mainPage.logout();
		 
	 System.out.println("###############################################################");
  }
  
  
  
  
  
  
  @DataProvider (name="PromiseData")
  public String[][] promiseData() {
	  
	  String[][] PromiseTestData = {{"", "","Blank Data",""}, {"sanjeetk@clariontechnologies.co.in", "clarion","Sonali test","Promise by Sonali Test"}};
	  
	  
	return PromiseTestData;
	  
  }
  
  }
  
  


