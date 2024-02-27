package project_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program11 
{
	@BeforeMethod
	public void pqr()
	{
		System.out.println("Before Method");
		
	}
	@Test
	public void zxy()
	{
		System.out.println("testcase1");
	}
	
	@Test
	public void abc()
	{
		System.out.println("testcase2");
	}
	@AfterMethod
	public void mno()
	{
		System.out.println("After Method");
	}
	@Test
	public void Sub()
	{
		System.out.println("testcase3");
	}
	


}
