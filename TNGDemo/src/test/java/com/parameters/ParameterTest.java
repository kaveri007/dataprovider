package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
	@Test
	
	//we have to use below line for passing parameters
	//these parameters are not test data, those are all environment variables which we use in xml file. also we can pass parameters using config.properties file. 
	@Parameters({"browser","url","emailid"})//testng.xml file will automatically pass the values to the given parameters.
	public void whiteboxLoginTest(String browser,String url,String emailid)//and we should pass those parameter to the method
	{
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\selenium\\gecodriver.exe");
			driver=new FirefoxDriver();
		}
		
		
        driver.manage().window().maximize();
        //then launching url
		driver.get(url);
		
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).clear();
		
		//here i don't want to hard  code user name here
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(emailid);//use the parameter instead of hard coding.
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		
	}
	
	@Test
	public void quit()
	{
		driver.quit(); 
	}
	
	
}
