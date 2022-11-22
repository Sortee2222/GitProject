package org.FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseUtilities.ScrollByJS;

public class BySendKeysDemoQA {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.get("https://demoqa.com/automation-practice-form");  
    	WebElement fileUpload = driver.findElement(By.id("uploadPicture"));
    	fileUpload.click();
//    	ScrollByJS.scrollByJS(driver, fileUpload);				//Generic Method
    	
    	fileUpload.sendKeys(System.getProperty("user.dir"),"./TextFiles/Resume.txt");
	
	}

}
