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

public class FileUploadRobotClass2 {

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
		
		
		StringSelection ss = new StringSelection("C:\\Users\\Shubham Sortee\\Desktop\\Agile Foundation.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String str = "C:\\Users\\Shubham Sortee\\Desktop\\Software Development\\ISTQB.pdf";
//		StringSelection ss = new StringSelection(str);
//		Toolkit .getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//		
//		
//		Robot r = new Robot();				//throws AWTException
//		r.keyPress(KeyEvent.VK_CONTROL);	//To Press CTRL key from Virtual Keyboard
//		r.keyPress(KeyEvent.VK_V);			//To Press 'V' key from Keyboard
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);	//Mandotory to Release as well
//		r.keyRelease(KeyEvent.VK_V);
//															
//		r.keyPress(KeyEvent.VK_ENTER);		//Press
//		r.keyRelease(KeyEvent.VK_ENTER);	//Release
//
//    	//Click 		//sendKeys		//Scroll  	
////    	1) Selenium		2) Javascript	//Action Class		//activeElements click sendKeys 
    		
		
		
		

		
		
		
		
		
		
	

	}

}
