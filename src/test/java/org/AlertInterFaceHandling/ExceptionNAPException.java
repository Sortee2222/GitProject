package org.AlertInterFaceHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptionNAPException {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/alerts");							
		driver.manage().window().maximize();				
		driver.findElement(By.id("timerAlertButton")).click();		//This will take 5 seconds to OPEN LINK
		
		
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20));
		wt.until(ExpectedConditions.alertIsPresent());		//alertIsPresent() is used for Explicit Wait
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());			//Since the Link will Take 5 seconds toh usko toh wo ELement milega hi nai n are and HENCE It'll Give you NAPException and will show message """no such alert"""
		alt.accept();								//To Avoid this you can use EXPLICIT WAIT 
//		alt.dismiss();
//		alt.sendKeys("");
	}

}
