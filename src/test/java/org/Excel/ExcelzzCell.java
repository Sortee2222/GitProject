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

public class ExcelzzCell 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		FileInputStream fis = new FileInputStream("./ExcelFiles/Test Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("AllStringTypes");	
		Row r1 = s1.getRow(1);						//(1) = 2nd Row Okay since Indexing
		Cell c1 = r1.getCell(2);					//Oth Cell Okay	//Shubham wala Cell
		
		String value = c1.getStringCellValue();
		System.out.println(value);
		
		
	
	}

}
 