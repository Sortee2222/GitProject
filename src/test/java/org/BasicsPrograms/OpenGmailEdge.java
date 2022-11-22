package org.BasicsPrograms;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;	//Star* for same package files
import org.openqa.selenium.edge.EdgeDriver;

public class OpenGmailEdge 
{

	public static void main(String[] args) throws InterruptedException 
	{
//		ChromeOptions obj = new ChromeOptions();
//		obj.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
    	driver.get("https://www.google.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(1000);  
    	driver.findElement(By.linkText("Gmail")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.linkText("Sign in")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[\" data-initial-value\"][@autocomplete = \"username\"]")).sendKeys("sorteeshubham");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//span[text() =\"Next\"]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.name("Passwd")).sendKeys("automation@2222");
    	Thread.sleep(1000);
    	driver.findElement(By.className("T-I T-I-KE L3")).click();


    	

    	driver.close();
	}

}
