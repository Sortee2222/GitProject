package org.ActionsClassKeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropSrcDest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/droppable");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		System.out.println("1st Way to Perform DRAG AND DROP");
		action.dragAndDrop(source, destination).perform();
		
		
		System.out.println("2nd Way to Perform DRAG AND DROP");
//		action.clickAndHold(source)					
//		.moveToElement(destination)
//		.release()
//		.build()
//		.perform();
		

		
//		.pause(Duration.ofSeconds(2))	
		System.out.println("Optimized 2nd Way to Perform DRAG AND DROP");

//		action.clickAndHold(driver.findElement(By.id("draggable")))
//		.moveToElement(driver.findElement(By.id("droppable")))
//		.release()
//		.build()
//		.perform();
		
		
	}

}
