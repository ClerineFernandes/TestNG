package project_TestNG;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program7 
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
	
	@Test
	public void testcase1()
	{
		System.out.println("testcase1");
	}
}
