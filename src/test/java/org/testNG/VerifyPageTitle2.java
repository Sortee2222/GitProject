package org.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyPageTitle2 
{
	WebDriver driverEdge;
	@BeforeTest
	public void login()
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		driverEdge = new EdgeDriver();

	}
	
	@Test
	public void verifyDashboardTitle()
	{
		driverEdge.get("https://www.instagram.com/");
    	
    	String excptitle = "Instagram";
    	String acttitle = driverEdge.getTitle();		
    	Assert.assertEquals(acttitle,excptitle);
    	
    	System.out.println("Test Case Completed");	
  	}
	
	@AfterTest
	public void clearData()
	{ 
		driverEdge.close();
	}
	
	
}
