package org.ActionsClassKeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultipleKeysChordFaceBook {

	public static Select sel;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/reg/");
		
//		driver.findElement(By.name("firstname")).sendKeys("Shubham");
				
		Actions action = new Actions(driver);
		action
		.sendKeys(Keys.TAB)
		.sendKeys("Shubham")
		.sendKeys(Keys.TAB)
		.sendKeys("Sortee")
		.sendKeys(Keys.TAB)
		.sendKeys("sorteeshubham@gmail.com")
		.sendKeys(Keys.TAB)
		.sendKeys("sorteeshubham@gmail.com")
		.sendKeys(Keys.TAB)
		.sendKeys("94231956").build().perform();
		
	
		sel = new Select(driver.findElement(By.id("day")));
		sel.selectByIndex(6);
				
		sel = new Select (driver.findElement(By.id("month")));
		sel.selectByValue("6");
				
		sel = new Select(driver.findElement(By.id("year")));
		sel.selectByVisibleText("1997");
		
		WebElement gender = driver.findElement(By.xpath("//label [text()='Female']"));
	
		if(gender.isSelected()==false)
		{
			driver.findElement(By.xpath("//label [text()='Male']")).click();
		}
		
		System.out.println("Hey Baby");
			
		System.out.println("FaceBook User Created Successfully");
	}

}
