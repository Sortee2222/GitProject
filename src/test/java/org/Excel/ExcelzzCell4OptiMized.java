package org.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelzzCell4OptiMized 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		FileInputStream fis = new FileInputStream("./ExcelFiles/Test Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("AllStringTypes");	
		
		for (int k=0; k<=s1.getLastRowNum(); k++)
		{			
			for (int i=0; i<s1.getRow(k).getLastCellNum(); i++)
			{
				System.out.println(s1.getRow(k).getCell(i).getStringCellValue());
			}	
			
		}	
		
		
		
		
		
		
		
	
	}

}
 