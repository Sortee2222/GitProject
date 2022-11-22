package org.testNG3;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class EnabledisEqualToTrue 
{
													//@Ignore this will not be Executed
	@Test
	public void hello1()
	{
		System.out.println("Hey I'm by default enabled");
	}
	
	@Test(enabled = false)
	public void hello2()
	{
		System.out.println("Hey I'm enabled = false");
	}
	
	@Test(enabled = true)
	public void hello3() 
	{
		System.out.println("Hey I'm enabled = true");
	}
}
