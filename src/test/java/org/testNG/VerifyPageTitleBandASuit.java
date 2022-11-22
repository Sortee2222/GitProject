package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.propertiesFiles.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class VerifyPageTitleBandASuit 
{	private WebDriver driver;
	private ConfigReader cr;
	
	@BeforeSuite
	public void init_Object()
	{
		cr = new ConfigReader();
	}
	@AfterSuite 
	public void clearObjects()
	{
		cr = null;
	}
	
	
	
	
	@BeforeMethod
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
    	driver.get(cr.getPropData("url"));
	}
	@Test
	public void verifyDashboardTitle()
	{	
		driver.findElement(By.id("email")).sendKeys(cr.getPropData("userName"));
		driver.findElement(By.id("pass")).sendKeys(cr.getPropData("password"));
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getCurrentUrl());
  	}	
	@AfterMethod
	public void clearData()
	{ 
		driver.close();
	}
	
	
}
