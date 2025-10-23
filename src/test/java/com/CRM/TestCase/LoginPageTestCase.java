package com.CRM.TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass{
  @BeforeClass
  public void pageSetup()
  {
	  hp.testSignInLink();
  }
  
	
	@Test
  public void validateLogin() {
	  String actUrl=lp.doLogin("test@gmail.com", "test123");
	  Assert.assertTrue(actUrl.contains("customers"),"Test Fail: Login failed");
	  System.out.println("Test Pass: Logged in successfully!");
	  
  }
}
