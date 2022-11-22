package org.Adventure3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PropertyFiles4 
{

	public static void main(String[] args) throws IOException 
	{	
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		FileInputStream fis = new FileInputStream("./PropertiesFiles/Config.properties"); 
		Properties prop = new Properties();
		prop.load(fis);
		
		String browserName = prop.getProperty("browserName");
		String url = prop.getProperty("url");
		String userName = prop.getProperty("userName");
		String password = prop.getProperty("password");

		
		System.out.println("browserName = " + browserName);
		System.out.println("url = " + url);
		System.out.println("userName = " + userName);
		System.out.println("password = " + password);
 
//    	driver.findElement(By.id("email")).sendKeys("shubham.sortee");
//    	driver.findElement(By.id("pass")).sendKeys("shivam94231956");						
//
//    	driver.findElement(By.name("login")).click();
    	
    	
    	
    	
  
		
		
	}

}
