package TestNGDemo.TNGDemo;

import org.testng.annotations.Test;

public class TestNGFeatures {
	//dependency between test cases
	
	@Test
	public void loginTest()
	{
		System.out.println("login test");
		
		//int i=9/0;
		
	}
	//DEPENDSONMETHODS is the most important feature in testng. some times if login page itself is not working then there is no point to execute diff test cases.
	//if login test fails the below test will get skipped automatically, home page test dependent on login test.
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() 
	{
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchPageTest()
	{
		System.out.println("search page test");
	}

	@Test(dependsOnMethods="loginTest")
	public void regPageTest()
	{
		System.out.println("registration page test");
	}

}
