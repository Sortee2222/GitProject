package org.ActionsClassKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickScroll {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    	driver.get("https://demoqa.com/automation-practice-form");
    	
    	WebElement twice = driver.findElement(By.id("hobbies-checkbox-1"));
    	WebElement studying = driver.findElement(By.cssSelector("[for=\"hobbies-checkbox-2\"]"));
    	Actions act = new Actions(driver);
		
    	act.scrollToElement(twice).perform();
    	act.doubleClick(twice).perform();
    	act.click(studying).perform();
		
    	

		
		
		
	}

}
