package org.Adventure2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException
	{				
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//span[contains(text(),'We')]")).click();
		WebElement fileUpload = driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;	//Since Normal Click() and Action Class is not working here
		js.executeScript("arguments[0].click();",fileUpload);
		
//		fileUpload.sendKeys("C:\\Users\\Shubham Sortee\\Desktop\\Agile Foundation.pdf");
		
		fileUpload.sendKeys(System.getProperty("user.dir"),"./TextFiles/Resume.txt");
		

		
		
		
		
		
		
	

	}

}
