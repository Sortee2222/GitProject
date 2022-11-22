package org.ActionsSeleniumJSEActiveElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadInFolder {

	public static void main(String[] args)
	{				
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
    	driver.get("https://demoqa.com/automation-practice-form");  	
    	WebElement fileUpload = driver.findElement(By.id("uploadPicture"));
    	
    	
    	//1st Way by using Selenium
    	fileUpload.click();
    	fileUpload.sendKeys("Shubi Dubi");
    	fileUpload.sendKeys(Keys.PAGE_DOWN);
    	
    	//2nd Way by using JavascriptExecutor

    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", fileUpload);
		js.executeScript("arguments[0].value='Shubham Sortee'", fileUpload);	
    	js.executeScript("arguments[0].scrollIntoView(true)", fileUpload);

    	//3rd Way by using JavascriptExecutor

		Actions act = new Actions(driver);		
		act.click();			act.click(fileUpload);			act.moveToElement(fileUpload);
		act.sendKeys(fileUpload, "SHubi Dubi");					act.sendKeys("Shubi Dubi");
		act.scrollToElement(fileUpload);
    	
    	//4th Way by using JavascriptExecutor
		driver.switchTo().activeElement().click();
		driver.switchTo().activeElement().sendKeys("Shubi Dubi");
		driver.switchTo().activeElement().sendKeys(Keys.PAGE_DOWN);
    	
    	
    	
    	fileUpload.sendKeys(System.getProperty("user.dir"),"./TextFiles/Resume.txt");
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	//Click 		//sendKeys		//Scroll  	
//    	1) Selenium		2) Javascript	//Action Class		//activeElements click sendKeys 
    		
		
		
		

		
		
		
		
		
		
	

	}

}
