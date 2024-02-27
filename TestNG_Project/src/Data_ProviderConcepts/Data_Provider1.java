package Data_ProviderConcepts;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class Data_Provider1 
	{
		@Test(dataProvider="data3")
		public void method3_for_double(double number) 
		{
			System.out.println(number+100.200);
			
		}
		@DataProvider(name="data3")
		public Object[][] method3()
		{
			return new Object[][] {{20.300},{30.300},{40.300},{50.300},{60.300}};
			
		}

}
