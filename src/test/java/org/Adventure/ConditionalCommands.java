package org.Adventure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demoqa.com/radio-button");
		
//		WebElement shubi = driver.findElement(By.xpath("//label [@for=\"impressiveRadio\"]"));
//		
//		System.out.println(shubi.isDisplayed());		
//		System.out.println(shubi.isSelected());
		
		
		WebElement enabled = driver.findElement(By.id("noRadio"));
		
		System.out.println(enabled.isEnabled());
		
		

	}

}
