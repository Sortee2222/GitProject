package org.testNG2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//Iss File ko directly run nai kr skte since it has Parameters so isko SUITE FILE par click krke hi RUn krna pdega or else it'll show @Optional or defined Exception
public class Parameterization 
{
	@Test
	@Parameters({"uNamess","pwdss"})		
	public void verifyDashboardTitle(String uName, String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.name("username")).sendKeys(uName);    																		
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button [@type='submit']")).click();				
		
		
	}
	
}
