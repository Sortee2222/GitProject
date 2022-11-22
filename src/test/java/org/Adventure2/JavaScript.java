package org.Adventure2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException
	{				
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		
		driver.findElement(By.xpath("//span [text() ='Upload Resume']")).click();
		Thread.sleep(2000);
		
		WebElement shubi = driver.findElement(By.id("file-upload"));
//		shubi.click();
		
		
		
		
		//Click				//sendKeys			//Scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("arguments[0].click()", shubi);
		
		
	
		
		

		

	}

}
