package org.DropDownSingleSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSelect2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.get("https://en-gb.facebook.com/reg");  
    	

    	driver.findElement(By.xpath("//input [@name=\"firstname\"]")).sendKeys("Automation");
    	//How to Select DropDowns so for this we have SELECT CLASS
    	
    	WebElement day = driver.findElement(By.id("day"));
    	Select sel1 = new Select(day);
    	sel1.selectByIndex(6);
    	
    	WebElement month = driver.findElement(By.id("month"));
    	Select sel2 = new Select(month);
    	sel2.selectByVisibleText("Jun");
    	
    	WebElement year = driver.findElement(By.id("year"));
    	Select sel3 = new Select(year);
    	sel3.selectByValue("1997");
    	
    	
    	System.out.println(sel2.getFirstSelectedOption().getText());	// getFSO() will give us Default Selected Value in WebElement and to Get TEXT we use getText() 
   
    	
    	
    	List <WebElement> all = sel2.getOptions();		//getOptions() will give us all the Values Present in that DropDown in the form of LIST OF WEBELEMENT
    	
    	for (WebElement obj : all)
    	{
    		System.out.println(obj.getText());
    	}
    	
//    	for (int i=0; i<allDays.size(); i++)
//    	{
//    		System.out.println(allDays.get(i).getText());
//    	}
    	
//    	Iterator ite = allDays.iterator();
//    	
//    	while(ite.hasNext())
//    	{
//    		System.out.println(ite.next());
//    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.TAB).sendKeys("Testing")
//		.sendKeys(Keys.TAB).sendKeys("9595995949")
//		.sendKeys(Keys.TAB).sendKeys("94231956");
		
		

    	
	}

}
