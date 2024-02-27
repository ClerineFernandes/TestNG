package project_TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program13 
{
@BeforeMethod
public void xyz()
{
	System.out.println("Test case1");
}
@Test
public void abc()
{
	System.out.println("Test case2");
}

@Test
public void ghi()
{
	System.out.println("Test case3");
}

@Test
public void def()
{
	System.out.println("Test case4");
}
	

	}


