package org.Adventure2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandelingMultiple {

	public static void main(String[] args)
	{				
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("starts-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);	
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		
		String parentID = driver.getWindowHandle();
		Set <String> allWindowIds = driver.getWindowHandles();
		
		Iterator<String> ite = allWindowIds.iterator();
		
		while(ite.hasNext())			
		{
			String id = ite.next();					//2		3		4
			if(id.equals(parentID))
			{
				continue;
			}
			driver.switchTo().window(id);			//	1(pID)	2	3	4(Element)
				
				try
				{
					WebElement text = driver.findElement(By.id("sampleHeading"));
					System.out.println(text.getText());		
					break;
				}
				catch(NoSuchElementException e)
				{
					continue;
				}
				
				
				
				
				
				
				
				
				

				
			
			
		}
		
		
		
		
		

		
		
		
		
		
		
	

	}

}
