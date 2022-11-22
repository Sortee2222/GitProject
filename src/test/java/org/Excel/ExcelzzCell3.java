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

public class ExcelzzCell3 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		FileInputStream fis = new FileInputStream("./ExcelFiles/Test Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("AllStringTypes");	
		
		for (int k=0; k<=s1.getLastRowNum(); k++)
		{	
			Row r1 = s1.getRow(k);					
			
			for (int i=0; i<r1.getLastCellNum(); i++)
			{
				Cell c1 = r1.getCell(i);					
				System.out.println(c1.getStringCellValue());
			}	
			System.out.println();
			
		}	
		
		
		
		
		
		
		
	
	}

}
 