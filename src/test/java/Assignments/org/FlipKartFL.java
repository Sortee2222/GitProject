package Assignments.org;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartFL 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button [@class ='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input [@title=\"Search for products, brands and more\"]")).sendKeys("Oppo K10");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button [@type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span [text() = 'Next']")).click();
		Thread.sleep(10000);
		
		System.out.println("Title is " + driver.getTitle());
		System.out.println("Program Ends");
	}

}
