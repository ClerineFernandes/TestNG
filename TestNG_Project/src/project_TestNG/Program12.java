package project_TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program12
{
	@BeforeMethod
	public void pqr()
	{
		System.out.println("Test4");
	}
	@Test
	public void xyz()
	{
		System.out.println("Test1");
	}
	@Test
		public void login()
		{
			System.out.println("Test3");
		}
		@AfterMethod
		public void mno()
		{
			System.out.println("Test5");
		}
}

