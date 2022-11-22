package org.activeElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActiveElementFaceBook {

	public static Select sel;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/reg/");
		
//When unable to perform operations like sendKeys() or click();, etc by using normal 
//SELENIUM, JAVA SCRIPT OR EVEN BY ACTIONS CLASS NA THAN WE USE ACTIVEELEMENT();
		
		WebElement ae = driver.switchTo().activeElement();
		//WHY NOT WORKING?????????????
		ae.sendKeys(Keys.TAB);									
		ae.sendKeys("Shubham");
		ae.sendKeys(Keys.TAB);
		ae.sendKeys("Sortee");
		ae.sendKeys(Keys.TAB);
		ae.sendKeys("sorteeshubham@gmail.com");
		ae.sendKeys(Keys.TAB);
		ae.sendKeys("sorteeshubham@gmail.com");
		ae.sendKeys(Keys.TAB);
		ae.sendKeys("94231956");						
		
		
		//BUt I"M WORKING
//		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys("Shubham");
//		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys("Sortee");
//		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys("sorteeshubham@gmail.com");
//		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys("sorteeshubham@gmail.com");
//		driver.switchTo().activeElement().sendKeys(Keys.TAB);
//		driver.switchTo().activeElement().sendKeys("94231956");
		

		
		
	
	
	}

}
