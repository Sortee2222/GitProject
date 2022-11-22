package org.ChromeOptions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("start-maximized");
//		options.addArguments("--disable-infobars");		//Floppp
//		options.addArguments("--headless");
//		options.addExtensions(new File (""));
//		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oppo Mobile K10 5G");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		System.out.println(driver.getTitle());

				
		
	}

}
