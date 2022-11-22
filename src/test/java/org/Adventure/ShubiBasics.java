package org.Adventure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShubiBasics {

	public static void main(String[] args) 
	{
				
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("shubham.sortee");
		driver.findElement(By.xpath("//input[@type = 'password']")).			sendKeys("shivam94231956");
		WebElement ele = driver.findElement(By.xpath("//button [@name=\"login\"]"));
		ele.click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
//		driver.close();		
//		driver.quit();
	}

}
