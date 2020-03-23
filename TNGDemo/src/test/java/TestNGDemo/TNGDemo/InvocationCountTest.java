package TestNGDemo.TNGDemo;

import org.testng.annotations.Test;

public class InvocationCountTest {

	// if we want to execute same test case 10 or 100 times we use "invocationCount" keyword.
	@Test(invocationCount=10)
	public void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("sum is:"+c);
	}
	
}
