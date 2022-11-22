package org.propertiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PropertyFilesDirectly 
{

	public static void main(String[] args) throws IOException 
	{			
		FileInputStream fis = new FileInputStream("./PropertiesFiles/Config.properties"); 
		Properties prop = new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.get(prop.getProperty("url"));
    	driver.findElement(By.id("email")).sendKeys(prop.getProperty("userName"));
    	driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));	//OR DIRECTLY PASS prop.getProperty("userName"); instead of creating a Variable
    	driver.findElement(By.name("login")).click();
    	
    	
    	
    	
  
		
		
	}

}
