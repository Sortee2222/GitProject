package org.BasicsPrograms;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class BasicOfSelenium2 
{
    public static void main( String[] args )
    {
    	String path = System.getProperty("User.dir");
    	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    	
    	ChromeDriver driverCd = new ChromeDriver();
    	
    	driverCd.get("https://www.google.com/");
  
    	
//    	System.setProperty("webdriver.edge.driver", "./driver/edgedriver.exe");
//    	
//    	EdgeDriver driverEd = new EdgeDriver();
//    	
//    	driverEd.get("https://www.google.com/");
    	
   
//    	driver.findElement(By.name("q")).sendKeys("Shubham Sortee");
//    	driver.findElement(By.title("Search")).click();
//    	
//    	String exctitle = "Google";
//    	String acttitle = driver.getTitle();
//    	
//    	if(exctitle.equals(acttitle))
//    	{
//    		System.out.println("Test is Passed");
//    	}
//    	else
//    	{
//    		System.out.println("Test is Failed");
//    	}
    }
}
