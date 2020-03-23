package TestNGDemo.TNGDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelDataProvider {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe\\");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.linkedin.com/");
	  
	  }
	
	@Test
	public void verifyLogin()
	{
		
	}
	
	
	@DataProvider
	public Object[][] testData()
	{
		Object[][] arrayobject=
		return arrayobject;
	}
	
	public String[][] getExcelData(String filename,String sheetname)
	{
		String[][] arrayExcelData=null;
		
		try {
			FileInputStream fs=new FileInputStream(filename);
		    Workbook wb= Workbook.getWorkbook(fs);
			Sheet sh=wb.getSheet(sheetname);	
			
			int totalnumberofcolumns=sh.getColumns();
			int totalnumberofrows=sh.getRows();
			arrayExcelData=new String[numberofcolumn-1][numberofrows];
			(for int i=0;)
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return arrayExcelData;
		
		
	}
	
	
	@AfterMethod
	public void  tearDown()
	{
		driver.quit();
	}
	
	

}
