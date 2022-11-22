package org.BasicsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenFlipKart {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div [@class=\"col-12-12 _2oO9oE\"]/div")).sendKeys("Oppo Mobiles");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
	}

}
