package org.Adventure3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PropertyFiles3 
{

	public static void main(String[] args) throws IOException 
	{	
		
		FileInputStream fis = new FileInputStream("./PropertiesFiles123/Config.properties123"); 
		Properties prop = new Properties();
		prop.load(fis);	
		
		prop.getProperty("userName");			//I have id 
		prop.getProperty("password");			// I have Password
		prop.getProperty("url");				//I have URL 
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button [@name=\"login\"]")).click();
		
		
		
		
		
    	
    	
    	
    	
  
		
		
	}

}
