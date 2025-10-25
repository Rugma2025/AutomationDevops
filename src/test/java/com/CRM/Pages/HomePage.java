package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.CRM.util.Utility;

public class HomePage {
	//encapsulation = private data+public member
	private WebDriver driver;
	
	//initialize driver (new keyword is used to create an object)
	                    //Constructor is used to initialize objects
	                    //Constructor should not have any return type
	                     //Constructor name should be same as the class name
	public HomePage(WebDriver driver) //base class driver
	{
		this.driver=driver;
	}
	//data member(locator)
	private By link=By.linkText("Sign In");
	
	//methods(functionality to be tested
	public String getAppUrl()
	{
		
		return driver.getCurrentUrl();
		
		
	}
	public String getAppTitle()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.getTitle();
	}
	
	public String testSignInLink()
	{
		Utility.getScreenShot(driver);
		driver.findElement(link).click();
		
		Utility.getScreenShot(driver);
		return driver.getCurrentUrl();
	}
	
	

}
