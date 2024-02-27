package Data_ProviderConcepts;


import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider4 
{
	@Test(dataProvider="testdata")
	public void login_to_facebook(String un, String pwd)
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		System.out.println(un.concat(" is my username and  ").concat(pwd).concat(" is my password"));
	}
	@DataProvider(name="testdata")
	public Object[][]dataforlogin()
	{
		Object[][] d1=new Object[2][2];
		d1[0][0]="ram@gmail.com"; //ram UN
		d1[0][1]="sita@ram321"; //ram pass
		d1[1][0]="sita@gmail.com";//sita UN
		d1[1][1]="ram@321";//sita pass
		return d1;
		
		
	}

}
