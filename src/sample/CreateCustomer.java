package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateCustomer 
{
	@Test
	public void createCustomer()
	{
	System.setProperty("webdriver.gecko.driver","C:\\64bitAutomationSW\\geckodriver.exe");
	FirefoxDriver driver =new FirefoxDriver();
	driver.get("http://srk:81/login.do");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.linkText("Projects & Customers")).click();
	driver.findElement(By.xpath("//input[@type='button']")).click();
	driver.findElement(By.name("name")).sendKeys("Sunil");
	driver.findElement(By.name("createCustomerSubmit")).click();
	driver.findElement(By.className("logoutImg")).click();
	driver.close();
	
	}
	
}
