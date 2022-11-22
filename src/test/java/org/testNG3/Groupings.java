package org.testNG3;

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

public class Groupings 
{
	@Test(groups={"smoke"})
	public void hello1()
	{
		System.out.println("Hey I'm smoke");
	}
	
	@Test(groups={"regression"})
	public void hello2()
	{
		System.out.println("Hey I'm regression");
	}
	
	@Test(groups={"UAT"})
	public void hello3()
	{
		System.out.println("Hey I'm UAT");
	}
	
	@Test(groups={"smoke", "regression"})
	public void hello4()
	{
		System.out.println("Hey I'm smoke and regression");
	}
	
	@Test(groups={"smoke", "UAT"})
	public void hello5()
	{
		System.out.println("Hey I'm smoke and UAT");
	}
	
	@Test(groups={"UAT", "regression"})
	public void hello6()
	{
		System.out.println("Hey I'm UAT and regression");
	}
	
}
