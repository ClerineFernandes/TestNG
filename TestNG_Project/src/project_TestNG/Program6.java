package project_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program6 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before suite");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before Method");
		
	}
	@Test
	public void testcase1()
	{
		System.out.println("testcase1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("testcase2");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("After Method");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("After Class");
	}
	@AfterTest
	public void at()
	{
		System.out.println("After Test");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("After Suite");
	}
	

}
