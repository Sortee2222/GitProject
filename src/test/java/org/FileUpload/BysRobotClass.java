package org.FileUpload;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BysRobotClass {
	
	//Order of Access Specifier does not matters in JAVA we can write it anywhere
	static public void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//span[contains(text(),'We')]")).click();
		WebElement fileUpload = driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;	//Since Normal Click() and Action Class is not working here
		js.executeScript("arguments[0].click();",fileUpload);
		
		StringSelection ss = new StringSelection("C:\\Users\\Shubham Sortee\\Desktop\\Software Development\\ISTQB.pdf");
		Toolkit .getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot r = new Robot();				//throws AWTException
		r.keyPress(KeyEvent.VK_CONTROL);	//To Press CTRL key from Keyboard
		r.keyPress(KeyEvent.VK_V);			//To Press 'V' key from Keyboard
		
		r.keyRelease(KeyEvent.VK_CONTROL);	//Mandotory to Release as well
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);		//Press
		r.keyRelease(KeyEvent.VK_ENTER);	//Release
		
		
		
	}

}
