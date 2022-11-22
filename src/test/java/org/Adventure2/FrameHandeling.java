package org.Adventure2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandeling {

	public static void main(String[] args)
	{				
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		WebElement shubi = driver.findElement(By.id("sampleHeading"));

		System.out.println(shubi.getText());
		
		
		
		

		
		
		
		
		
		
	

	}

}
