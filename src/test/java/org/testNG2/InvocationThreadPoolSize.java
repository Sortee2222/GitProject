package org.testNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationThreadPoolSize 
{
	@Test(invocationCount=3, threadPoolSize=2)
	public void verifyDashboardTitle()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("shubham.sortee");    																		
		driver.findElement(By.id("pass")).sendKeys("94231956");
		driver.findElement(By.name("login")).click();
    	
    	String excptitle = "Facebook";
    	String acttitle = driver.getTitle();		
    	if(excptitle.equals(acttitle)==true)
    	{
    		System.out.println("Test is Passed");
    	}
    	else
    	{
    		System.out.println("Test is Failed");
    	}
    	driver.quit();
    	System.out.println("Program Ends");
	}
	
}
