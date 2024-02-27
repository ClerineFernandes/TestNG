package project_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program10
{
	@Test
	public void def()
	{
		System.out.println("testcase1");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("After Method");
	}
	@Test
	public void abc()
	{
		System.out.println("testcase2");
	}
	@Test
	public void login()
	{
		System.out.println("testcase3");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before Method");
		
	}

}
