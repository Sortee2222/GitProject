package org.testNG2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx 
{
	@Test(dataProvider="bhoo bhoo")
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
	
	@DataProvider(name = "bhoo bhoo")		//If no name than write method Name in the Test Case i.e. if testers don't specify the name of Data Provider than Method Name becomes the name of Data Provider (In this case it'll become "dataInput")
	public Object[][] dataInput()
	{
		Object[][] ar = new Object[4][2];
		ar[0][0] = "Admin";			ar[0][1] = "admin123";
		ar[1][0] = "Admin";			ar[1][1] = "Invalid";
		ar[2][0] = "Invalid";		ar[2][1] = "admin123";
		ar[3][0] = "Invalid";		ar[3][1] = "Invalid";
		
		return ar;
	}
}
