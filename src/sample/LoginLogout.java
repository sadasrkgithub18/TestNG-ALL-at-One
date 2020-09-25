package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginLogout
{
	@Test
	public void loginLogout() 
	{
	System.setProperty("webdriver.gecko.driver","C:\\64bitAutomationSW\\geckodriver.exe");
	FirefoxDriver driver =new FirefoxDriver();
	driver.get("http://srk:81/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.className("logoutImg")).click();
	driver.close();
	
	}
		
}
