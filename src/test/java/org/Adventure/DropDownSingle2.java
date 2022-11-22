package org.Adventure;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSingle2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://en-gb.facebook.com/reg/");
		WebElement month = driver.findElement(By.id("month"));
		
		Select sel = new Select (month);			
		
		System.out.println(sel.getFirstSelectedOption().getText());
		
		List<WebElement> allMonths = sel.getOptions();
		
//		for(WebElement obj : allMonths)
//		{
//			System.out.println(obj.getText());
//		}
		
//		for(int i=0; i<allMonths.size(); i++)
//		{
//			System.out.println(allMonths.get(i).getText());
//		}
		
		Iterator<WebElement> ite = allMonths.iterator();
		while(ite.hasNext())
		{
			WebElement id = ite.next();
			System.out.println(id.getText());
		}
		
		
		
	}

}
