package org.Adventure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCLassDragDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
//		1st Way to Drag And Drop
//		act.dragAndDrop(source, destination).perform();

//		2nd Way to Drag and Drop
		act.clickAndHold(source)
		.moveToElement(destination)
		.release()
		.build().perform();
		
//		3) Drag and Drop but without Destination
//		WebElement draggable = driver.findElement(By.id("dragBox"));
//		act.dragAndDropBy(draggable, 390, 21).perform();
				
	}

}
