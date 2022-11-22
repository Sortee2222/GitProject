package org.ActionsClassKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndSendKeys {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	
    	Actions act = new Actions(driver);		//Alwyz Remember Perform() & Build()
		
		WebElement userName = driver.findElement(By.id("email"));
		act.sendKeys(userName,"shubham.sortee").perform();
		
    	WebElement password = driver.findElement(By.id("pass"));
    	act.sendKeys(password, "shivam94231956").perform();

    	WebElement loginButton = driver.findElement(By.name("login"));
    	act.click(loginButton).perform();
    	
		
    	

		
		
		
	}

}
