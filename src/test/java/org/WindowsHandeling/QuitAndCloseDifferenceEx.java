package org.WindowsHandeling;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class QuitAndCloseDifferenceEx {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/browser-windows");							
		
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Id is = "+driver.getWindowHandle());
		driver.findElement(By.id("windowButton")).click();
		
		
		Set<String> allWinIds = driver.getWindowHandles();
		Iterator <String> ite = allWinIds.iterator();
		while (ite.hasNext())
		{
			String id = ite.next();
			if(id.equals(parentId))
			{
				continue;
			}
			
			driver.switchTo().window(id);			//Bhai Switch toh krdiya but hume kaise pata k kaunse Window ki ID mili hai apneko?? But Ek Cheeej Confirm hai k ab ParentID wapas nahi aayegi since this Set of Strings has each Value Unique and will not repeat it	
			try
			{
				String text = driver.findElement(By.tagName("h1")).getText();
				System.out.println("Text Available on the Window is = "+text);
				break;
			}
			catch(NoSuchElementException e)
			{
				continue;
			}
			
		}
		
//VERY VERY IMPORTANT FOR INTERVIEW TO EXPLAIN IT WITH EXAMPLE
		
		driver.close();						//It'll CLose CHILD WINDOW and agar Child Window CLose krne k bad kch Operation Perform krna ho toh simply SWITCH KRDO PARENT ID PAR
		driver.switchTo().window(parentId);		
		driver.close();						//Now it'll close Parent Window 
		
//Or Directly CLose Everything in One Go		
//		driver.quit();
		
				
		
	}

}
