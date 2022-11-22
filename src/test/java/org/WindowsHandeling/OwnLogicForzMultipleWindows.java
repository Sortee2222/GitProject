package org.WindowsHandeling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class OwnLogicForzMultipleWindows {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/browser-windows");							
//		driver.manage().window().maximize();				
		
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Id is = "+driver.getWindowHandle());
		driver.findElement(By.id("tabButton")).click();
		
		
		Set<String> allWinIds = driver.getWindowHandles();
		Iterator <String> ite = allWinIds.iterator();
//		while (ite.hasNext())
//		{
//			System.out.println(ite.next());
//		}
		while(ite.hasNext())
		{
			String id = ite.next();
			if(id.equals("EC8ABEF78C5DEB58A6F12E928FFBE336"));
			{
				driver.switchTo().window(id);
				System.out.println(driver.findElement(By.tagName("h1")).getText());
			}
			ite.next();
			
		}
		
		

		
				
		
	}

}
