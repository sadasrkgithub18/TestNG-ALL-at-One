package groupExecution;

import org.testng.annotations.Test;

public class Sample1 
{
	@Test(groups="Functional")
	 public void testFunctional()
	 {
		 System.out.println("Functional is tested 1");
	 }
	 
	 @Test(groups="Integration")
	 public void testIntegration()
	 {
		 System.out.println("Intgration is tested 1");
	 }
	 
	 @Test(groups="System")
	 public void testSystem()
	 {
		 System.out.println("System is tested 1");
	 }

}
