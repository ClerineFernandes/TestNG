package project_TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Program15 
{@Test(invocationCount=11)
		public void case1()
		{
			System.out.println("Execute1");
			}
		@Test
		public void case2()
		{
			System.out.println("Execute2");
			}
		@Test
		public void case3()
		{
			System.out.println("Execute3");
			}
		@Test
		public void case4()
		{
			System.out.println("Execute4");
			}
		@BeforeMethod
		public void case5()
		{
			System.out.println("Execute5");
			}
		@AfterMethod
		public void case6()
		{
			System.out.println("Execute6");
			
		}}


