package org.AlertInterFaceHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertRediffMail {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");							
		WebElement signIn = driver.findElement(By.xpath("//input [@value=\"Sign in\"]"));	
		signIn.click();
		
		Alert alt = driver.switchTo().alert();			//Alert is an INTERFACE (DRIVER KO KAHA K BHAI SWITCH TO ALERT)
		System.out.println(alt.getText());
//		alt.getText();
//		alt.accept();
//		alt.dismiss();
//		alt.sendKeys("");					//Mostly used for ALERTS jisme APNEKO INPUT DALNA hota hai for ex - openQA
		
		
	
		
		
		//We can also Write the above methods like following (NO NEED TO CREATE ALERT INTERFACE KA REFERENCE)
		
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().alert().getText();
//		driver.switchTo().alert().sendKeys("Hey Baby");
		
	}

}
