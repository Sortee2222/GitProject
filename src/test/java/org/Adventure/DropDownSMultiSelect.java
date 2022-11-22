package org.Adventure;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSMultiSelect 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		
		WebElement multiSelect = driver.findElement(By.id("cars"));
		
		Select sel = new Select (multiSelect);			
		
		sel.selectByIndex(3);
		sel.selectByValue("volvo");
		sel.selectByVisibleText("Saab");		Thread.sleep(2000);
		
		sel.deselectByVisibleText("Saab");
		List <WebElement> allSelected = sel.getAllSelectedOptions();
		for(WebElement obj :allSelected )
		{
			System.out.println("Selected Options are = "+obj.getText());
		}
		
		System.out.println(sel.isMultiple());
	
	}

}
