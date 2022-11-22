package org.Adventure2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvent {

	public static void main(String[] args)
	{				
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/reg/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB)
		.sendKeys("Shubi Dubi")
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.build().perform();
		
		
		
		
		
		

		

	}

}
