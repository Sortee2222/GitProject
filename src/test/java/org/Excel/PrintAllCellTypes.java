package org.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllCellTypes 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{		
		FileInputStream fis = new FileInputStream("./ExcelFiles/Test Data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("AllDataTypes");			//Will SHow Error IllegalStateException
	
		for (int k=1; k<=s1.getLastRowNum(); k++)
		{			
			for (int i=0; i<s1.getRow(k).getLastCellNum(); i++)
			{
//				System.out.println(s1.getRow(k).getCell(i).getCellType());
				CellType ct = s1.getRow(k).getCell(i).getCellType();
				
				switch(ct)
				{
				case STRING: System.out.println(s1.getRow(k).getCell(i).getStringCellValue());
				break;
				case NUMERIC: if(DateUtil.isCellDateFormatted(s1.getRow(k).getCell(i)))
				{
					System.out.println(s1.getRow(k).getCell(i).getDateCellValue());
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					String str = sdf.format(s1.getRow(k).getCell(i).getDateCellValue());
					System.out.println(str);		
				}
				else
				{
					System.out.println((long)s1.getRow(k).getCell(i).getNumericCellValue());
				}
				break;
				
				case FORMULA: System.out.println(s1.getRow(k).getCell(i).getCellFormula());
				break;
				case BOOLEAN: System.out.println(s1.getRow(k).getCell(i).getBooleanCellValue());
				break;
				case BLANK: System.out.println("Cell is Blank");
				break;
				case ERROR: System.out.println(s1.getRow(k).getCell(i).getErrorCellValue());
				break;
				case _NONE: System.out.println("No Cell Available");
				default : System.out.println(" Invalid Cell ");
				
				}
			}	
			
		}	
		
		
		
		
		
		
	
	}

}
 