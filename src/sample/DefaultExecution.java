package sample;

import org.testng.annotations.Test;

public class DefaultExecution 
{
  @Test(priority=2)
  public void testAA()
  {
	  
	  System.out.println("AA Executed");
  }
  
  @Test(priority=1)
  public void testCC()
  {
	  
	  System.out.println("CC Executed");
  }
  
  @Test(priority=3)
  public void testBB()
  {
	  
	  System.out.println("BB Executed");
  }
}
