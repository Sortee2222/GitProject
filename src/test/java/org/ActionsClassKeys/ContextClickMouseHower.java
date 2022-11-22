package org.ActionsClassKeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMouseHower {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.flipkart.com/");
		WebElement cutPopup = driver.findElement(By.cssSelector("[class=\"_2KpZ6l _2doB4z\"]"));
		WebElement loginHower = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions act = new Actions(driver);
		
		act.click(cutPopup).perform();
		act.moveToElement(loginHower).perform();
		act.contextClick(loginHower).build().perform();
		
		System.out.println("Program Ends");
		
		

	}

}
