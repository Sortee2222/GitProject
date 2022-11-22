package org.Adventure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShubiBasics2 {

	public static void main(String[] args) 
	{
				
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		WebElement shubi = driver.findElement(By.xpath("//a [@href=\"https://mail.google.com/mail/?authuser=1&ogbl\"]"));
		System.out.println(shubi.getText());
		
//		driver.close();		
//		driver.quit();
	}

}
