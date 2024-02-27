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

public class Program8 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("After Suite");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before Method");
		
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("Before Class");
	}
	public void ac()
	{
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("Before Test");
	}
}