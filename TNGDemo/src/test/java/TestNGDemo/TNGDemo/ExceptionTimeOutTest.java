package TestNGDemo.TNGDemo;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	
	//timeOut method i used to execute particular test case should execute within that time.
	//some times if there are any infinite loops we did not close the loop ,that situation invocationTimeOut will stop execution after specified no of milli seconds time.
	
	/*@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	public void infiniteLoopTest()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
			
		}
		
		}*/
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1()
	{
		//here we get number format exception because we can't change string to integer format in that it will failed.
		 String x="100A";
		Integer.parseInt(x);
	}
}
