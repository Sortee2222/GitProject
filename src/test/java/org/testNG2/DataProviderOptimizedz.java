package org.testNG2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderOptimizedz 
{
	@Test(dataProvider="dataInput")
	public void verifyDashboardTitle(String userName, String passWord)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.name("username")).sendKeys(userName);    																		
		driver.findElement(By.name("password")).sendKeys(passWord);
		driver.findElement(By.xpath("//button [@type='submit']")).click();				
		
		
	}
	
	@DataProvider
	public Object[][] dataInput()
	{
		Object [][]ar = {{"Admin","admin123"},{"Admin","Invalid"}};				
		return ar;
	}
}
