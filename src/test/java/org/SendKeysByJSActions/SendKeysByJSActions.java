package org.SendKeysByJSActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysByJSActions {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

			WebDriver driver = new ChromeDriver();	
			driver.get("https://www.amazon.in/");
			
			WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
//1st Way Normal
//			ele.sendKeys("Shubham Sortee");						
			
//2nd Way By using JavascriptExecutor
			JavascriptExecutor js = (JavascriptExecutor)driver;		
			js.executeScript("arguments[0].value='Shubham Sortee'", ele);	
			
//3rd Way By using Actions Class
			Actions action = new Actions(driver);
			action.sendKeys(ele, "Shubham Sortee").perform();
			
			driver.findElement(By.id("nav-search-submit-button")).click();	//Used to Click Only
			
			
			

	}

}
