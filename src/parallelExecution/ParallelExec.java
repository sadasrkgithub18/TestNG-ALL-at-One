package parallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExec
{

  @Parameters("t1")
  @Test
  public void testParallelExec(String browser)
  {
	  if(browser.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","C:\\64bitAutomationSW\\geckodriver.exe");
		  FirefoxDriver driver =new FirefoxDriver();
		  driver.get("http://srk:81/login.do");
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
			
	  }
	  
	  else if(browser.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\64bitAutomationSW\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("http://srk:81/login.do");
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	  }
  }
}
