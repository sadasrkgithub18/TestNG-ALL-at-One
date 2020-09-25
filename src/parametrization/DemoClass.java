package parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoClass 
{
  @Parameters("t1")	
  @Test
  public void testSample(double d)
  {
	  System.out.println("D value is:" +d);
  }
  
}
