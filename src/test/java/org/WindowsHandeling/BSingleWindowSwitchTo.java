package org.WindowsHandeling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class BSingleWindowSwitchTo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/browser-windows");							
//		driver.manage().window().maximize();				
		
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Id is = "+driver.getWindowHandle());
		driver.findElement(By.id("tabButton")).click();
		
		
		Set<String> allIds = driver.getWindowHandles();
		Iterator <String> ite = allIds.iterator();
		String id = ite.next();
		if(id.equals(parentId))
		{
			id = ite.next();
			driver.switchTo().window(id);
			System.out.println(driver.findElement(By.tagName("h1")).getText());
		}
		
		
		
		
		
		
		System.out.println("Child Id is = "+driver.getWindowHandle());		//Just to Verify k driver change hua hai

		
				
		
	}

}
