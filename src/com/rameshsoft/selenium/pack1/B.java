package com.rameshsoft.selenium.pack1;

import org.testng.annotations.Test;

public class B 
{
   @Test(enabled = false)	
   public void hello()
   {
	   System.out.println("In Hello Method");
   }
   
   @Test(priority=0)
   public void welcome()
   {
	   System.out.println("In Welcome method");
   }
   
   @Test(priority=1)
   public void bye()
   {
	   System.out.println("In Bye method");
   }
   
   @Test(dependsOnMethods= {"welcome", "bye"})
   public void soon() 
   {
	   System.out.println("In Soon method");
   }
	
}
