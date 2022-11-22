package org.WebDriverMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MethodsEx {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.facebook.com/");    	
		   
    	driver.findElement(By.id("email")).sendKeys("shubham.sortee");
    																		driver.findElement(By.id("pass")).sendKeys("shivam94231956");

    	driver.findElement(By.name("login")).click();
		options.addArguments("--disable-notifications");
    	
    	System.out.println("Program Starts");
    	System.out.println(driver.getCurrentUrl());
    	System.out.println(driver.getTitle());
   // 	System.out.println(driver.getPageSource());
    	driver.quit();
    	System.out.println("Program Ends");
	}

		
}


