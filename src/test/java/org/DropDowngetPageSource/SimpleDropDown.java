package org.DropDowngetPageSource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleDropDown {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	driver.get("https://demoqa.com/select-menu");   
    	
    	WebElement sddElement1 = driver.findElement(By.xpath("//div [text() =\"Select Option\"]"));
    	//System.out.println(driver.getPageSource());
    	sddElement1.click();		
    	WebElement sddElement2 = driver.findElement(By.xpath("//div [text() = 'Group 1, option 1']"));
    	sddElement2.click();
    		
	}

}
