package org.Adventure2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadFromDesktop {

	public static void main(String[] args)
	{				
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    	driver.get("https://demoqa.com/automation-practice-form");  	
    	WebElement fileUpload = driver.findElement(By.id("uploadPicture"));
    	
    
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView(true)", fileUpload);
    	
    	fileUpload.sendKeys("C:\\Users\\Shubham Sortee\\Desktop\\Agile Foundation.pdf");
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	//Click 		//sendKeys		//Scroll  	
//    	1) Selenium		2) Javascript	//Action Class		//activeElements click sendKeys 
    		
		
		
		

		
		
		
		
		
		
	

	}

}
