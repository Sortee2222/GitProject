package org.Adventure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCLassScrollClickSKeys {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		WebElement uName = driver.findElement(By.id("userName"));
//		uName.sendKeys("Hey");
		WebElement submitButton = driver.findElement(By.id("submit"));
//		submitButton.click();
		Actions act = new Actions(driver);
		
		act.sendKeys(uName, "Hey Baby").perform();
		act.scrollToElement(submitButton).perform();
		act.click(submitButton).perform();
		
		
	}

}
