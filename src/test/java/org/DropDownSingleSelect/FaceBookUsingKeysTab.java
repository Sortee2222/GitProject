package org.DropDownSingleSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FaceBookUsingKeysTab {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.get("https://www.facebook.com");  
    	driver.findElement(By.xpath("//div [@id=\"reg_pages_msg\"]/preceding::a[1]")).click();    	

    	driver.findElement(By.xpath("//input [@name=\"firstname\"]")).sendKeys("Automation");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).sendKeys("Testing")
		.sendKeys(Keys.TAB).sendKeys("9595995949")
		.sendKeys(Keys.TAB).sendKeys("94231956").build().perform();
		
	}

}
