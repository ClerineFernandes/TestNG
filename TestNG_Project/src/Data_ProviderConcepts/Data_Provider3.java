package Data_ProviderConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider3
{
	@Test(dataProvider="listofcity")
	public void method1(String input) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement  e1=driver.findElement(By.name("q"));
	e1.sendKeys(input);
	e1.sendKeys(Keys.ENTER);
	System.out.println(driver.getTitle());
	driver.quit();

}
	@DataProvider(name="listofcity")
	public Object[][] method1()
	{
		return new Object[][] {{"Bangalore"},{"Pune"},{"Mumbai"},{"Delhi"},{"Chennai"}};
		
	}
	

}
