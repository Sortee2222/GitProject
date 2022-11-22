package org.Adventure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperationsNavigation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.facebook.com");	Thread.sleep(2000);
		
		driver.navigate().back();							Thread.sleep(2000);
		
		driver.navigate().forward();						Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		
	}

}
