package org.AlertInterFaceHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeoutException {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/alerts");							
		driver.manage().window().maximize();				
		driver.findElement(By.id("timerAlertButton")).click();		//This will take 5 seconds to OPEN LINK
		
		
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(3));		//Duration is 3 seconds and Element is taking 5 seconds to Load and Selenium is not able to locate that within 3 seconds so it'll Show TimeoutException
		wt.until(ExpectedConditions.alertIsPresent());		
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
	}
}
