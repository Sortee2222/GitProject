package org.DropDownMultipleSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectEx {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=try_dom_select_multiple");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value=\"Select multiple\"]")).click();
		WebElement element = driver.findElement(By.id("mySelect"));
		
		Select select = new Select(element);
		
		select.selectByIndex(0);
		select.selectByValue("CO");
		select.selectByVisibleText("Apple");
//		select.selectByVisibleText("Banana");
//		select.selectByVisibleText("Orange");
//		select.selectByVisibleText("Pear");
//		
		select.deselectByVisibleText("Pear");
		
		
		
		//System.out.println(select.getFirstSelectedOption());
		List <WebElement> selected = select.getAllSelectedOptions();
		for(WebElement obj : selected)
		{
			System.out.println(obj.getText());
		}
		
	}

}
