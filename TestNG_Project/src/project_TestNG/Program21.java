package project_TestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program21
{
	@Test
	public void youtube() throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	JavascriptExecutor name1=(JavascriptExecutor) driver;
	for(int i=1;i>0;i++)
	{
	name1.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
	}
	
	}
}
