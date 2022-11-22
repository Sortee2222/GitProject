package org.FrameHandeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABasicOfFrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://demo.automationtesting.in/Frames.html");							
//		driver.manage().window().maximize();				
		
		WebElement textBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));

		textBox.sendKeys("Hey Baby");		
		
		
		//Even after identifying the Element Properly by using Locators still 
		//It's showing NOSUCHELEMENTException WHY?????????????
		//bcoz the WebELement which you're trying to locate is inside the FRAME
		//& To access such elements firstly, we've to Switch to that particular 
		//Frame and than perform any actions  
		
		

	}

}
