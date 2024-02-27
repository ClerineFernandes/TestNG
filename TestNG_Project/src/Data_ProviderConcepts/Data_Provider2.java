package Data_ProviderConcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider2 
{
	@Test(dataProvider="data1")
	public void  method1_for_addition(int number)
	{
		System.out.println(number+100);
	}
	@DataProvider(name="data1")
	public Object[][] method1()
	{
		return new Object[][] {{100},{200},{300},{400},{500}};
	}

		@Test(dataProvider="data2")
		public void  method1_for_String(String name)
		{
			System.out.println(name.concat(" is first name"));
		}
	@DataProvider(name="data2")
	public Object[][] method2()
	{
		return new Object[][] {{"Clerine"},{"Flevia"},{"Riya"},{"Sneha"},{"Ram"}};
		


}

}
