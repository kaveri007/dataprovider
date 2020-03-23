package TestNGDemo.TNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CarLoginApplicatiom {
	@Test(dataProvider="getData")
	public void Login(String username,String password)
	{
		
		System.out.println(username);
		System.out.println(password);

}
@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[3][2];

	data[0][0]="first username";
	data[0][1]="first password";
	data[1][0]="ram";
	data[1][1]="123ram";
	data[2][0]="lakshmi";
	data[2][1]="234lakshmi";
     return data;
}
}