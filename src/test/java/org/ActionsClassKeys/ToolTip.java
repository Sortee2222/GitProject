package org.ActionsClassKeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips");
		
		Actions act = new Actions(driver);
		WebElement toolTip = driver.findElement(By.id("toolTipButton"));				
		act.moveToElement(toolTip).click().build().perform();
		
		act.pause(Duration.ofSeconds(3)).perform();
		WebElement txt = driver.findElement(By.xpath("//div [text()='You hovered over the Button']"));
		System.out.println(txt.getText());
		
		

	}

}
