package org.Adventure2;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExamples {

	public static void main(String[] args) 
	{

		ChromeOptions options = new ChromeOptions();
//		options.addArguments("start-maximized");
//		options.addArguments("--disable-notifications");
//		options.addArguments("--disable-infobars");
//		options.addArguments("--headless");
//		options.addExtensions(new File(""));
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		WebDriver driver = new ChromeDriver(options);		//Pass Object of ChromeOptions
		driver.get("https://www.amazon.in/");
		

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oppo Mobile K10 5G");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		System.out.println(driver.getTitle());
		

		

	}

}
