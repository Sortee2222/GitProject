package org.ActionsClassKeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableOnlySrc {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/dragabble");
		
		WebElement source = driver.findElement(By.id("dragBox"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(source, 300, 50).perform();
		
		
		
	}

}
