package org.WindowsHandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsOfWindow {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/browser-windows");							
		driver.manage().window().maximize();				
		
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Id is = "+parentId);
		
		driver.findElement(By.id("tabButton")).click();
		
		System.out.println("new Tab Id Ideally Change honi chahiye"
				+ " but it'll give same id = "+driver.getWindowHandle());
		
		//Which means driver is still pointing to First Opened Window Right 
		//Even After Opening a New Tab still so for this now we have to Switch it
		
		
	}

}
