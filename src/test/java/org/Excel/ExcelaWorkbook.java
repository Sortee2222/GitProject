package org.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelaWorkbook 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		FileInputStream fis = new FileInputStream("./ExcelFiles/Test Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("AllDataTypes");
		Row r1 = s1.getRow(0);
		Cell c1 = r1.getCell(4);

		System.out.println(c1.getStringCellValue());
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(c1.getCellType());
//		
////		System.out.println(c1.getStringCellValue());				//Name City 
////		System.out.println(c1.getBooleanCellValue());				//Availability
//		System.out.println((long)c1.getNumericCellValue()); 		//Mobile No
//		System.out.println((int)c1.getNumericCellValue()); 			//PinCode

		
		
		
		
		
		
//		System.out.println("No. of Sheets = "+wb.getNumberOfSheets());
//		System.out.println("Index Of ALlDataTypes Sheet = "+wb.getSheetIndex("AllDataTypes"));
//		System.out.println("Index Of Sheet @ 0th Indexing = "+wb.getSheetName(0));
//		
//		for(int i=0; i<wb.getNumberOfSheets(); i++)
//		{
//			System.out.println(wb.getSheetName(i));
//		}
		
	}

}
 