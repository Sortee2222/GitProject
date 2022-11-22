package org.testNG4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionFacebookk 
{

	@Test
	public void verifyPageTitle() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Hello Mobile", Keys.ENTER);
		Thread.sleep(3000);
		
		SoftAssert sa = new SoftAssert();

		//To verify Title
		String actTitle = driver.getTitle();
		String expTitle = "Log in to Facebook";
		sa.assertEquals(actTitle, expTitle, "Title is Mismatched"); 	

		//To verify CurrentURL
		String actURL = driver.getCurrentUrl();
		String expURL = "https://www.facebook.com/";
		sa.assertNotEquals(actURL, expURL, "URL is Mismatched"); 

		//Text Assertion for input field
		String actAttribute = driver.findElement(By.id("email")).getAttribute("value");
		String expAttribute = "";
		sa.assertEquals(actAttribute, expAttribute, "UserName text is Mismatched"); 

		//Border Assertion
		String actBorder = driver.findElement(By.id("email")).getCssValue("border");
//		String expBorder = "1px solid #f02849"; //This is HEXA Value and we have to convert it into RGB Value
		String expBorder = "1px solid rgb(240, 40, 73)";	//Give Spaces after each Value
		sa.assertEquals(actBorder, expBorder, "Border Colour is Mismatched"); 

		// Error Message Assertion
		String actErrorMessage = driver.findElement(By.xpath("//div [@id=\"email_container\"]/div[2]")).getText();
		String expErrorMessage = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		sa.assertEquals(actErrorMessage, expErrorMessage, "Error message is Mismatched");
		
		//FaceBook Icon is Displayed or not
		WebElement icon = driver.findElement(By.xpath("//body [@dir=\"ltr\"]"));
		sa.assertTrue(icon.isDisplayed());
		
		
//		sa.assertAll();			//If we write it here than it'll through all the Exceptions here which he's catching from above so the ideal place will be at the end of CODE
//		driver.quit();
		sa.assertAll();			//If we don't write this ALL TEST CASES WILL BE PASSED

	}


}