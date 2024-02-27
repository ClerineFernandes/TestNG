package Data_ProviderConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider5 
{
	@Test(dataProvider="testdata")
	public void amazon(String un,String pwd)
	{
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions a1=new Actions(driver);
	a1.moveToElement(signin).perform();
	WebElement e1=driver.findElement(By.linkText("Sign in"));
	e1.click();
	driver.findElement(By.id("ap_email")).sendKeys("un");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("pwd");
	driver.findElement(By.id("signInSubmit")).click();

}

	@DataProvider(name="testdata")
	public Object[][] data_for_amazonlogin()
	{
		Object d1[][]=new Object[7][2];
		d1[0][0]="right username";
		d1[0][1]="right password"   ;                      //line no 34 and 35 are the data for testcase
				d1[1][0]=  "Wrong Password"  ;               //this is for testcase2
				d1[1][1]="Wrong username" ;
						d1[2][0]=  "Wrong username"  ;        //this is for testcase3
						d1[2][1]= "right password";
								d1[3][0]=  "Wrong username" ;     //this is for testcase4
								d1[3][1]= "Wrong Password" ;
										d1[4][0]="";
										d1[4][1]=  "Any password" ;        //this is for testcase5
												d1[5][0]="Any username";
												d1[5][1]=  "" ;            //this is for testcase6
												
														d1[6][0]="";
														d1[6][1]= "" ;
														return d1;
												
		
	}
}
