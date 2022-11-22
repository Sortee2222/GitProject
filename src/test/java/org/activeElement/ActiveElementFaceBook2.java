package org.activeElement;

import java.time.Duration;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActiveElementFaceBook2 {

	public static Select sel;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/reg/");
//		driver.findElement(By.id("u_0_b_xO")).sendKeys("Hey Baby");
		
//When unable to perform operations like sendKeys() or click();, etc by using normal 
//SELENIUM, JAVA SCRIPT OR EVEN BY ACTIONS CLASS NA THAN WE USE ACTIVEELEMENT();
		WebElement ae = driver.switchTo().activeElement();
		
//		ae.sendKeys(Keys.TAB);
//		ae.click();
//		ae.sendKeys(Keys.PAGE_DOWN);
		ae.findElement(By.cssSelector("[name ='firstname']")).sendKeys("Hey Baby");
		
//		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys("Shubham");
//		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys("Sortee");
		
		
	
	
	}

}
