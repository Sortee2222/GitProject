package org.BasicsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenFacebook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(2000);
		   
    	driver.findElement(By.id("email")).sendKeys("shubham.sortee");
    	Thread.sleep(2000);
    																		driver.findElement(By.id("pass")).sendKeys("shivam94231956");

    	driver.findElement(By.name("login")).click();
		options.addArguments("--disable-notifications");
    	Thread.sleep(12000);
    	
    	
    	
    	
    	String excptitle = "Facebook";
    	String acttitle = driver.getTitle();

    			
    	if(excptitle.equals(acttitle)==true)
    	{
    		System.out.println("Test is Passed");
    	}
    	else
    	{
    		System.out.println("Test is Failed");
    	}
    	driver.quit();
	}

}
