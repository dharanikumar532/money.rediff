package practiceprograms;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelfile {
	XSSFWorkbook wb;
	public excelfile(String inputfile) throws Throwable
	{
		FileInputStream fi=new FileInputStream(inputfile);
		wb=new XSSFWorkbook(fi);
	}
	public int getrowcount(String sheetname)
	{
		int row=wb.getSheet(sheetname).getLastRowNum();
		return row;
	}
	public int getcellcount(String sheetname)
	{
		int column=wb.getSheet(sheetname).getRow(0).getLastCellNum();
		return column;
	}
	public String getcelldata(String sheetname,int row,int column)
	{
		String data="";
		if(wb.getSheet(sheetname).getRow(row).getCell(column).getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			int value=(int)wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			data=String.valueOf(value);
			return data;
		}
		else
		{
			data=wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
			return data;
		}
	}
	
	public static void main(String[] args) throws Throwable {
		excelfile e=new excelfile("D://Book1.xlsx");
		int row=e.getrowcount("login");
		System.out.println(row);
		int column=e.getcellcount("login");
		System.out.println(column);
		/*for(int i=1;i<=row;i++)
		{
			for(int j=0;j<=2;j++)
			{
			System.out.println(e.getcelldata("login", i, j));
			}
		}*/
		System.out.println(e.getcelldata("login", 1, 2));
	}

}
