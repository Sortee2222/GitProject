package org.ActionsClassKeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeysChord {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		WebElement lastname = driver.findElement(By.id("lastName"));

		
		firstname.sendKeys("Hey Baby");
		
		Actions action = new Actions(driver);
		firstname.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		firstname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		action.sendKeys(Keys.TAB);
		lastname.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
	
		
		
		
	}

}
