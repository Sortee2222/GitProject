package org.WebElementsMethods3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Methods3BasicMethods {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
    	driver.get("https://demoqa.com/radio-button");    	
		
    	WebElement yesRadio1 = driver.findElement(By.xpath("//label [@for=\"yesRadio\"]"));
    	System.out.println(yesRadio1.isDisplayed());
//    	
    System.out.println("****************************************************");	
//    
    	WebElement impressive = driver.findElement(By.id("yesRadio"));
    	System.out.println(impressive.isSelected());
    	if (impressive.isSelected()==false)
    	{
    		driver.findElement(By.xpath("//label [@for=\"impressiveRadio\"]")).click();
    	}
    	else
    	{
    		System.out.println("Hey Baby");
    	}
//    	
    System.out.println("****************************************************");	
//    	
    	WebElement noRadio = driver.findElement(By.id("noRadio"));
    	System.out.println("No Button is Selected = "+noRadio.isEnabled());
    	if (noRadio.isEnabled()==true)
    	{
    		System.out.println("Hey Baby No Button is Enabled");
    	}
    	else 
    	{
    		System.out.println("Hey Baby No Button is NOT Enabled na");
    	}
    	
    	System.out.println("Program Ends");
//    	
//    	
//    	driver.quit();
	}

		
}


