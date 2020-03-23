package TestNGDemo.TNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
/*setup system property for chrome
launch browser
login to app
enter URL
google title Test
logout from app
enter URL
search test
logout from app
close browser
delete all cookies
PASSED: googleTitleTest*/

	//we have 3 diff sections pre conditions,test cases,post conditions.
	//pre conditions annotations---starts with @Before
	@BeforeSuite
	public void setUp()
	{
		System.out.println("setup system property for chrome");
	}
	
	@BeforeClass
	public void login()
	{
		System.out.println("login to app");
	}
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("launch browser");
		
	}
	
	//sequence of execution
	/*@BeforeMethod
	 * @Test----1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test---2
	 * @AfterMethod
	 */
	
	@BeforeMethod
	public void enterUrl()
	{
		System.out.println("enter URL");
	}
	
	
	//test cases---starting with @Test
	@Test
	public void googleTitleTest()
	{
		System.out.println("google title Test");
		
	}
	@Test
	public void searchTest()
	{
		System.out.println("search test");
	}
	
	
	//post conditions---starting with @After
	@AfterMethod
	public void logOut()
	{
		System.out.println("logout from app");
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
	System.out.println("close browser");
	}
	
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("delete all cookies");
	}
	
	/*@AfterSuite
	public void generateTestReport()
	{
		System.out.println("generate test report");
	}*/ 
	
}
