package org.AlertInterFaceHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOpenQA {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/alerts");							
		driver.manage().window().maximize();				//Advertisement k wajah se
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton")).click();
		
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("Hey Baby");
		alt.accept();
//		alt.dismiss();
		

	}

}
