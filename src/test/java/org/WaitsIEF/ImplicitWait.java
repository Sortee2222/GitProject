package org.WaitsIEF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//(0.5 seconds,1,1.5,2,2.5,3-----------------------10)
		
		driver.findElement(By.id("hello")).click();
		Thread.sleep(2);
		driver.findElement(By.xpath("//input [text = 'Gmail]"));
		
		
		
		driver.get("https://www.boomingbulls.com");
		
		
		
	}

}
