package org.propertiesFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PropertyFilesGeneric 
{

	public static void main(String[] args) throws IOException 
	{	
		
		ConfigReader cr = new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.get(cr.getPropData("url"));
    	driver.findElement(By.id("email")).sendKeys(cr.getPropData("userName"));
    	driver.findElement(By.id("pass")).sendKeys(cr.getPropData("password"));	//OR DIRECTLY PASS prop.getProperty("userName"); instead of creating a Variable
    	driver.findElement(By.name("login")).click();
    	
    	
    	
    	
  
		
		
	}

}
