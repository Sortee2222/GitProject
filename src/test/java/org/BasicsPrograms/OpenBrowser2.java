package org.BasicsPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowser2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.facebook.com/");
    	Thread.sleep(2000);
		   
    	driver.findElement(By.id("email")).sendKeys("shubham.sortee");
    	Thread.sleep(2000);
    	driver.findElement(By.id("pass")).sendKeys("9595922228");

    	driver.findElement(By.name("login")).click();
    	Thread.sleep(5000);
    	
    	String excptitle = "Facebook";
    	String acttitle = driver.getTitle();

    	//WebElement acttitle = driver.findElement(By.xpath("//a[@class=\"qi72231t o9w3sbdw nu7423ey tav9wjvu flwp5yud tghlliq5 gkg15gwv s9ok87oh s9ljgwtm lxqftegz bf1zulr9 frfouenu bonavkto djs4p424 r7bn319e bdao358l fsf7x5fv tgm57n0e jez8cy9q s5oniofx m8h3af8h l7ghb35v kjdc1dyq kmwttqpk dnr7xe2t aeinzg81 srn514ro oxkhqvkx rl78xhln nch0832m om3e55n1 cr00lzj9 rn8ck1ys s3jn8y49 g4tp4svg o9erhkwx dzqi5evh hupbnkgi hvb2xoa8 jl2a5g8c f14ij5to l3ldwz01 aglvbi8b icdlwmnq cdum9rwi m4pnbp5e ctyh02ob onc49dji\"]"));
    			
    	if(excptitle.equals(acttitle))
    	{
    		System.out.println("Test is Passed");
    	}
    	else
    	{
    		System.out.println("Test is Failed");
    	}
    	driver.close();
	}

}
