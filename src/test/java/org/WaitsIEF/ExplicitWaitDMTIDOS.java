package org.WaitsIEF;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDMTIDOS {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(5));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button [text() ='Cancel']")));
		
		driver.get("https://www.boomingbulls.com");
		
		
		
	}

}
