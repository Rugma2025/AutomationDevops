package com.CRM.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.CRM.Pages.HomePage;
import com.CRM.Pages.LoginPage;

public class BaseClass {
	
	public WebDriver driver; // since we need to use it throughout the project, making as public
    public HomePage hp;
    public LoginPage lp;
	
	@BeforeTest
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		hp=new HomePage(driver);
		lp=new LoginPage(driver);
	 
	}
	
}
