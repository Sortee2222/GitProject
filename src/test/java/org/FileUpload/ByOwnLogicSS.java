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

public class ByOwnLogicSS {

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
		
		StringSelection ss = new StringSelection("C:\\Users\\Shubham Sortee\\Desktop\\Software Development\\ISTQB.pdf");
		Toolkit .getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
		
		//WE CANNOT USE ACTION CLASS OR KEYS(KEYS.CHROD(KEYS.CONTROL)METHOD SINCE 
		//IT REQUIRES A ELEMENT AND USI ELEMENT ME HUM SEND KR SKTE HAI 
		//FOR EX - 
		//ELE.SENDKEYS(-------------------) AISE KRKE AND JO POP-UP OPEN HOTA HAI
		//WO WINDOWS POP-UP REHTA HAI AND HENCE WE CANNOT INSPECT IT SO ISILIYE 
		//ROBOT CLASS KA USE KIYA JATA HAI
		
		
		
		
		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);	//To Press CTRL key from Keyboard
//		r.keyPress(KeyEvent.VK_V);			//To Press 'V' key from Keyboard
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);	//Mandotory to Release as well
//		r.keyRelease(KeyEvent.VK_V);
//		
//		r.keyPress(KeyEvent.VK_ENTER);		//Press
//		r.keyRelease(KeyEvent.VK_ENTER);	//Release
		
		
		
	}

}
