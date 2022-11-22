package org.propertiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PropertyFiles2 
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

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
    	driver.get(url);
    	driver.findElement(By.id("email")).sendKeys(userName);
    	driver.findElement(By.id("pass")).sendKeys(password);	//OR DIRECTLY PASS prop.getProperty("userName"); instead of creating a Variable
    	driver.findElement(By.name("login")).click();
    	
    	
    	
    	
  
		
		
	}

}
