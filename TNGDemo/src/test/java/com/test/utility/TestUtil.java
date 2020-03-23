package com.test.utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {

    static Workbook book;
    static Sheet sheet;
	public static String TESTDATA_SHEET_PATH="C:\\Users\\kakum\\eclipse-workspace\\TNGDemo\\src\\test\\java\\com\\testdata\\RegTestData.xlsx";
	
	public static Object[][] getTestData(String sheetName)
	{
		FileInputSatream file=null;
		try
		{
			FileInputStream file=new FileInputStream(TESTDATA_SHEET_PATH);
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			book=WorkbookFactory.create(file );
		}catch(InvalidFormatException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		sheet=book.getSheet(sheetName);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
			{
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		
		return data;
		
	}
	
	
	
	/*public static ArrayList<Object[]> getDtaFromExcel()
	{
		public  XSSFWorkbook reader; 
		
		ArrayList<Object[]> myData=new ArrayList<Object[]>();
		try
		{
			reader=new XlsReader("C:\\Users\\kakum\\eclipse-workspace\\TNGDemo\\src\\test\\java\\com\\testdata\\RegTestData.xlsx");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		for(int rowNum=2;rowNum<=reader.getRowCount("RegTestData");rowNum++)
		{
			String firstname=reader.getCellData("RegTestData","firstname","rowNum");
			String lastname=reader.getCellData("RegTestData","lastname","rowNum");
			String address1=reader.getCellData("RegTestData","address1","rowNum");
			String address2=reader.getCellData("RegTestData","address2","rowNum");
			String city=reader.getCellData("RegTestData","city","rowNum");
			String state=reader.getCellData("RegTestData","state","rowNum");
			String zipcode=reader.getCellData("RegTestData","zipcode","rowNum");
			String emailaddress=reader.getCellData("RegTestData","emailaddress","rowNum");
			Object ob[]= {firstname,lastname,address1,address2,city,state,zipcode,emailaddress};
			myData.add(ob);
		}
		return myData;
	}*/	
}
