package demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
	  @Test(enabled = true)
	  public void login() 
	  {
		  System.out.println("it is login method");
	  }
	  
	  @Test(enabled = true,description = "it is for inbox method",dependsOnMethods = "login")
	  public void inbox() 
	  {
		  System.out.println("it is inbox method");
	  }
	  
	  @Test(enabled = true,description = "it is for inbox method",dependsOnMethods = "login")
	  public void inbox2() 
	  {
		  System.out.println("it is inbox method");
	  }
	  
	  @BeforeTest
	  public void beforeTest() 
	  {
		  System.out.println("it is beforetest method");
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("it is aftertest method");
	  }
}
