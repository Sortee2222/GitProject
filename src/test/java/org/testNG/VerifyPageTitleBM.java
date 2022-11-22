package org.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyPageTitleBM 
{
	private WebDriver driver;
	@BeforeMethod
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
	
	@Test(priority=1)
	public void verifyDashboardTitle()
	{	
    	String excpTitle = "Instagram";
    	String actTitle = driver.getTitle();		
    	Assert.assertEquals(actTitle,excpTitle);
    	System.out.println(actTitle);	
  	}
	@Test(priority=2)
	public void verifyCurrentUrl() 
	{    	
    	String expectedURL = "https://www.instagram.com/";
    	String actualURL = driver.getCurrentUrl();		
    	Assert.assertEquals(actualURL,expectedURL);
    	
    	System.out.println(actualURL);	
		
  	}
	
	@AfterMethod
	public void clearData()
	{ 
		driver.close();
	}
	
	
}
