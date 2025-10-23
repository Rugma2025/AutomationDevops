package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
		return driver.getTitle();
	}
	
	public String testSignInLink()
	{
		driver.findElement(link).click();
		return driver.getCurrentUrl();
	}
	
	

}
