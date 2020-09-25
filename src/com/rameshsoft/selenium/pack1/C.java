package com.rameshsoft.selenium.pack1;

import org.testng.annotations.Test;

public class C 
{
	   @Test(timeOut=1)	
	   public void hello()
	   {
		   System.out.println("In Hello Method");
	   }
	   
	   @Test(invocationCount = 10, invocationTimeOut = 100)
	   public void welcome()
	   {
		   System.out.println("In Welcome method");
	   }
	   
	   @Test(description="No description for as of now")
	   public void bye()
	   {
		   System.out.println("In Bye method");
	   }
	   
	   
	   @Test(alwaysRun = true)
	   public void soon() 
	   {
		   System.out.println("In Soon method");
	   }
}
