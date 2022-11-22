package com.OrangeHRM.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.OrangeHRM.Pages.POMLoginPageFunctionality;
import com.OrangeHRM.Pages.POMLoginPageVisibility;

public class POMVerifyFunctionalityOfLogin 
{	
	private WebDriver driver;
	private POMLoginPageFunctionality lp_obj;
	
	@BeforeMethod
	public void loginData() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		lp_obj = new POMLoginPageFunctionality(driver);
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
		lp_obj.typeUsername("Admin");
		lp_obj.typePassword("admin123");
		lp_obj.clickLoginButton();
	}
	
	
}
