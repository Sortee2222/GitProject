package com.OrangeHRM.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OrangeHRM.Pages.LoginPageNormal;

public class VerifyLoginNormal 
{	
	private WebDriver driver;
	private LoginPageNormal lp_obj;
	
	@BeforeMethod
	public void loginData() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		lp_obj = new LoginPageNormal(driver);
	}
	@AfterMethod
	public void clearData()
	{
		driver.close();
		lp_obj = null;
	}
	
	@Test
	public void verifyValidLogin() throws InterruptedException
	{		
		lp_obj.typeUsername("Admin");
		lp_obj.typePassword("admin123");
		lp_obj.clickLoginButton();
	}
	
	
}
