package org.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		FileInputStream fis = new FileInputStream("./ExcelFiles/Test Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		Sheet s1 = wb.getSheet("AllStringTypes");	
		int lastRowNum = s1.getLastRowNum();
		int lastPhysicalNumOfRow = s1.getPhysicalNumberOfRows();
		
		System.out.println(lastRowNum);				//WRONG OutPut
		System.out.println(lastPhysicalNumOfRow);
		
		
		
		//Only Method which will give wrong OutPut is 
		//s1.getLastRowNum();
		//baki sab methods will give Correct OutPut Okay
	}

}
 