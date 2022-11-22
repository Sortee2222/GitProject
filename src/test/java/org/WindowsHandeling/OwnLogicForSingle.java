package org.WindowsHandeling;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OwnLogicForSingle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://demoqa.com/browser-windows");							
		
		String parentId = driver.getWindowHandle();
		System.out.println("Parent Id is = "+parentId);
		
		driver.findElement(By.id("tabButton")).click();
		
		Set <String> allWinIds = driver.getWindowHandles();
		Iterator<String> ite = allWinIds.iterator();

//1st WAY and 2nd WAY is DOWNSIDE OKAY SCROLL		
		while(ite.hasNext())
		{
			String id = ite.next();
			if(id.equals(parentId))
			{
				continue;
			}
			else
			{
				driver.switchTo().window(id);
				System.out.println(driver.findElement(By.tagName("h1")).getText());
				break;
			}
		}	
//2nd WAY 		
//		while(ite.hasNext())
//		{
//			String id = ite.next();
//			if(!id.equals(parentId))
//			{
//				driver.switchTo().window(id);
//				System.out.println(driver.findElement(By.tagName("h1")).getText());
//				break;
//			}
//			else
//			{
//				continue;
//			}
	}

}
