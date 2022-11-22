package org.BasicsPrograms;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;	//Star* for same package files

public class OpenGmailChrome 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Here I've used JavascriptExecutor since by using Normal Click it'll not identify 
		//the NEXT Button coz of Compatibility issue of driver needs to be updated OR 
		//element is not VISIBLE OR Ht and Width of Element is not greater than O Zero
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(1000);  
    	driver.findElement(By.linkText("Gmail")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.linkText("Sign in")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.name("identifier")).sendKeys("sorteeshubham");
    	Thread.sleep(1000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
    	js.executeScript("arguments[0].click();", nextButton);
    	Thread.sleep(1000);
    	driver.findElement(By.name("Passwd")).sendKeys("automation@2222");
    	Thread.sleep(1000);
    	driver.findElement(By.className("T-I T-I-KE L3")).click();


    	

    	driver.close();
	}

}
