package utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil 
{
	//To get the data from excel file
	public static String getData(String path, String sheet, int rn, int cn) {
		try
		{
			FileInputStream fis = new FileInputStream(new File(path));
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheet).getRow(rn).getCell(cn).toString();
			return data;
		}
		catch(Exception e)
		{
			return "";
		}
		
	}
	
	//To get the row count
	public static int getRowCount(String path, String sheet) {
		try 
		{
			FileInputStream fis = new FileInputStream(new File(path));
			Workbook wb = WorkbookFactory.create(fis);
			int rn = wb.getSheet(sheet).getLastRowNum();
			return rn;
		}
		catch(Exception e)
		{
			return 0;
		}
	}
	
	//To get the column count
		public static int getColCount(String path, String sheet, int rn) {
			try 
			{
				FileInputStream fis = new FileInputStream(new File(path));
				Workbook wb = WorkbookFactory.create(fis);
				int cn = wb.getSheet(sheet).getRow(rn).getLastCellNum();
				return cn;
			}
			catch(Exception e)
			{
				return 0;
			}
		}
	

}
