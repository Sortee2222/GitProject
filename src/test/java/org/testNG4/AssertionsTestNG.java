package org.testNG4;
import static org.testng.Assert.*;		//Star for all Methods

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTestNG 
{
	
	@Test
	public void verifyPageTitle()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.google.in/");
		driver.findElement(By.name("q")).sendKeys("Shubham Sortee", Keys.ENTER);	
		
		String actTitle = driver.getTitle();
		String expTitle = "SSSShubham Sortee - Google Search";
		
//		Assert.assertEquals(actTitle, expTitle, "Title is Mismatched"); 	//fail
		assertNotEquals(actTitle, expTitle, "Title is Mismatched");			//pass & no need to write Assert since we've imported all methods by using *Star*
		assertTrue(false);
		driver.quit();
	}
	
	
}