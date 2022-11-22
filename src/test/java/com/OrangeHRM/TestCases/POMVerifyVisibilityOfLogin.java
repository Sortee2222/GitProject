package com.OrangeHRM.TestCases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.OrangeHRM.Pages.POMLoginPageVisibility;

public class POMVerifyVisibilityOfLogin 
{	
	private WebDriver driver;
	private POMLoginPageVisibility lp_obj;
	
	@BeforeMethod
	public void loginData() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		lp_obj = new POMLoginPageVisibility(driver);
	}
	@AfterMethod
	public void clearData()
	{
		driver.close();
		lp_obj = null;
	}
	
	@Test
	public void verifyVisibilityOfLogin()
	{		
		SoftAssert sa = new SoftAssert();
		
		sa.assertTrue(lp_obj.isUsernameVisible());
		sa.assertTrue(lp_obj.isPasswordVisible());
		sa.assertTrue(lp_obj.isLoginButtonVisible());
		sa.assertTrue(lp_obj.isLogoVisible());
		sa.assertTrue(lp_obj.isForgotPasswordVisible());
		sa.assertTrue(lp_obj.isSocialMediaLinkVisible());
		
		sa.assertAll();
	}
	
	
}
