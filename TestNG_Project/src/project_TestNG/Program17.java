package project_TestNG;

import org.testng.annotations.Test;

public class Program17 
{
	
		@Test(priority=1)
		public void Login()
		{
			System.out.println("Testcase1");
		}
		@Test(priority=-1, invocationCount=10)
		public void Logout()
		{
			System.out.println("Testcase2");
		}
		@Test(priority=2)
		public void search()
		{
			System.out.println("Testcase3");
		}
		
	}


