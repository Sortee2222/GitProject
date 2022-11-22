package org.DropDowngetPageSource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleDropDown2 {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	driver.get("https://demoqa.com/select-menu");   
    	
    	driver.findElement(By.xpath("//div [text() =\"Select Option\"]")).click();
    	//System.out.println(driver.getPageSource());		
    	driver.findElement(By.xpath("//div [text() = 'Group 1, option 1']")).click();
    		
	}

}
