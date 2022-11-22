package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FaceBookLogin 
{
	@Test
	public void verifyDashboardTitle()
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driverEdge = new EdgeDriver();
		driverEdge.get("https://www.facebook.com");
		
		driverEdge.findElement(By.id("email")).sendKeys("shubham.sortee");    																		
		driverEdge.findElement(By.id("pass")).sendKeys("shivam94231956");
		driverEdge.findElement(By.name("login")).click();
    	
    	String excptitle = "Facebook";
    	String acttitle = driverEdge.getTitle();		
    	if(excptitle.equals(acttitle)==true)
    	{
    		System.out.println("Test is Passed");
    	}
    	else
    	{
    		System.out.println("Test is Failed");
    	}
//    	driverEdge.close();
	}
	
}
