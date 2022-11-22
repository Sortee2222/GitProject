package org.DropDownSingleSelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSelectOptiMized 
{
	public static Select sel;
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.get("https://en-gb.facebook.com/reg");  
    
    	//How to Select DropDowns so for this we have SELECT CLASS
    	//SELECT CLASS is only used for select HTML TAGS & FOR OTHER DROPDOWN WE HAVE getPageSource();
    	
    	sel = new Select(driver.findElement(By.id("day")));
    	sel.selectByIndex(6);
    	
    	sel = new Select(driver.findElement(By.id("month")));
    	sel.selectByVisibleText("Jun");
    	
    	sel = new Select(driver.findElement(By.id("year")));
    	sel.selectByValue("1997");
    	
    	
    	System.out.println(sel.getFirstSelectedOption().getText());	// getFSO() will give us Default Selected Value in WebElement and to Get TEXT we use getText() 
   
    	
    	//since sel is same for all so now the following List<WebElement> will give us last wale ki LIST i.e. Years wali
    	List <WebElement> all = sel.getOptions();		//getOptions() will give us all the Values Present in that DropDown in the form of LIST OF WEBELEMENT
    	
    	for (WebElement obj : all)
    	{
    		System.out.println(obj.getText());
    	}
    	
//    	for (int i=0; i<all.size(); i++)
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
