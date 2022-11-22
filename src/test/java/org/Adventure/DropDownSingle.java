package org.Adventure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSingle 
{
	public static Select sel;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://en-gb.facebook.com/reg/");
				
		sel = new Select(driver.findElement(By.id("day")));
		sel.selectByIndex(10);
				
		sel = new Select (driver.findElement(By.id("month")));
		sel.selectByValue("6");
				
		sel = new Select(driver.findElement(By.id("year")));
		sel.selectByVisibleText("1975");
		
		sel.getFirstSelectedOption();
		
		
		
	}

}
