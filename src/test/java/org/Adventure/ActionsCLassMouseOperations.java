package org.Adventure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCLassMouseOperations {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement cut = driver.findElement(By.xpath("//button [@class=\"_2KpZ6l _2doB4z\"]"));
			
		Actions act = new Actions(driver);
		act.click(cut).perform();				Thread.sleep(3000);
		
		WebElement mouseHover = driver.findElement(By.xpath("//a [text()='Login']"));
		
		act.moveToElement(mouseHover).perform();		//Hover Over the Element
		act.contextClick(mouseHover).perform();			//Used to RIGHT CLICK
		
		Thread.sleep(2000);
		WebElement more = driver.findElement(By.cssSelector("[class=\"exehdJ\"]"));
		
		act.doubleClick(more).perform();
		
	}

}
