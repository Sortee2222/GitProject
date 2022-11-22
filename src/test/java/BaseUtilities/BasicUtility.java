package BaseUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicUtility 
{	
	public void startUp(String bName) 
	{
		if(bName.equalsIgnoreCase("ch") || bName.equalsIgnoreCase("chrome"))
		{	
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driverCh = new ChromeDriver();
		}
		else if(bName.equalsIgnoreCase("edge")) 
		{
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			WebDriver driverEdge = new EdgeDriver();
		}
		else
		{
			System.out.println(" Please Enter ch or chrome or edge");
		}
	}
}
