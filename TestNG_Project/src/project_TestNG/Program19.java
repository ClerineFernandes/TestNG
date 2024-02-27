package project_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Program19
{
	@Test
	public void amazon()
	{
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebElement signin=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions a1=new Actions(driver);
	a1.moveToElement(signin).perform();
	WebElement e1=driver.findElement(By.linkText("Sign in"));
	e1.click();
	driver.findElement(By.id("ap_email")).sendKeys("clerine20@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Sptc300#er");
	driver.findElement(By.id("signInSubmit")).click();
    
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);

}
}
