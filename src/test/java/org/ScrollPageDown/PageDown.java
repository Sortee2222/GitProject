package org.ScrollPageDown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageDown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.youtube.com/");
		
		WebElement ytSearch = driver.findElement(By.xpath("//input [@id='search']"));
		ytSearch.sendKeys(Keys.PAGE_DOWN);

	}

}
