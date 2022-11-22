package org.WaitsIEF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FluentWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/mschromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		FluentWait <WebDriver> fw = new FluentWait<WebDriver>(driver);		
		
		
		driver.get("https://www.boomingbulls.com");
		
		
		
	} 

}
