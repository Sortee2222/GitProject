package org.ScrollingClickJScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByJS 
{

	public static void main(String[] args)
	{
		//Scrolling Not Working 
		try
		{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("Shubham Sortee");

		driver.findElement(By.id("nav-search-submit-button")).click();
		
		WebElement ele2 = driver.findElement(By.xpath("//a[@aria-label=\"Go to next page, page 2\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",ele2);     
		
		driver.close();			//driver.quit();
		}
		catch(Exception e)
		{
			System.out.println("Hey Baby");
		}
		
	}
		

}






