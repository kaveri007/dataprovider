package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;



public class HalfEbayTest {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterinfo&usage=2943&ru=");
		
	}
	
	@DataProvider
	//it will fetch data from excel file using apachi poi api.
    public Object[][] getTestData()
	{
		Object[][] data=TestUtil.getTestData("RegTestData");
		return data;
	}
	
	
	
	@Test(dataProvider="getTestData")
	
	public void halfEbayRegPageTest(String firstname,String lastname,String address1,String address2,String city,String state,String zipcode,String emailaddress)
	{
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstname);
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastname);
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys(address1);
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys(address2);
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys(city);
		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));
		select.deselectByVisibleText(state);
		driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys(zipcode);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(emailaddress);
		driver.findElement(By.xpath("//*[@id=\"retype_email\"]")).sendKeys(emailaddress);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
