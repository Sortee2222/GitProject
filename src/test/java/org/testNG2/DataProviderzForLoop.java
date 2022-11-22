package org.testNG2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderzForLoop 
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
	public Object[][] dataInput() throws IOException
	{
		FileInputStream fis = new FileInputStream("./ExcelFiles/Excel Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("OrangeHRM");
		
		int totalRows = s1.getLastRowNum();
		int totalColumns = s1.getRow(0).getLastCellNum();
		Object[][]ar = new Object[totalRows][totalColumns];
		
		
		for(int i=1,a=0; i<=totalRows; i++,a++)							//WHy starting from 1?? coz of FirstName na bhau
		{
			for(int k=0; k<totalColumns; k++)
			{
				ar[a][k] = s1.getRow(i).getCell(k).getStringCellValue();
				
			}
		}
		
		
		
		
		return ar;
	}
}
