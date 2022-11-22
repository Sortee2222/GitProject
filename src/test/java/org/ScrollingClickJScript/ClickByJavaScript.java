package org.ScrollingClickJScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickByJavaScript 
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("Shubham Sortee");
		
//1st Way		
		//driver.findElement(By.id("nav-search-submit-button")).click();
//2nd Way		
		WebElement ele2 = driver.findElement(By.id("nav-search-submit-button"));
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.id("nav-search-submit-button")));
		
		driver.close();			//driver.quit();
	}

}






