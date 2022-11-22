package org.FrameHandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoSite2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demo.automationtesting.in/Frames.html");							
//		driver.manage().window().maximize();				
		
//		WebElement textBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
//
//		WebElement outerFrame = driver.findElement(By.id("singleframe"));
		
		

		

	}

}
