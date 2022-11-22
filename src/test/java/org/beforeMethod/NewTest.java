package org.beforeMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest 
{	private WebDriver driver;
	@BeforeMethod
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}	
  @Test
  public void verifyLoginPageUrl()  
  {
	  driver.findElement(By.id("email")).sendKeys("shivam.deshmukh22");
	  driver.findElement(By.id("pass")).sendKeys("94231956");
	  driver.findElement(By.name("login")).click();
	  System.out.println(driver.getCurrentUrl());
  }
  
  @AfterMethod
  public void logOut()
  {
	  driver.close();
  }
}
