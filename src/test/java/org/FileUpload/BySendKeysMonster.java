package org.FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BySendKeysMonster {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//span[contains(text(),'We')]")).click();
		WebElement fileUpload = driver.findElement(By.id("file-upload"));
		
    	fileUpload.sendKeys("C:\\Users\\Shubham Sortee\\Desktop\\Software Development\\ISTQB.pdf");

    	
	
	}

}
