package project_TestNG;

import org.testng.annotations.Test;

public class Program16 
{
	@Test
	public void case1()
	{
		System.out.println("Testcase1");
	}
	@Test(enabled=false)
	public void case2()
	{
		System.out.println("Testcase2");
	}

}

