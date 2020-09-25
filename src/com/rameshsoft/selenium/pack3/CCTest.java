package com.rameshsoft.selenium.pack3;

import org.testng.annotations.Test;

public class CCTest 
{
	   @Test(groups = {"RR","SS","EE"})
	   public void hello()
	   {
		   System.out.println("In Hello Method");
	   }
	   
	   @Test(groups = {"SS","EE"})
	   public void welcome()
	   {
		   System.out.println("In Welcome method");
	   }
	   
	   @Test(groups = {"RR","EE"})
	   public void bye()
	   {
		   System.out.println("In Bye method");
	   }
	   
	   @Test(groups = {"EE"})
	   public void soon() 
	   {
		   System.out.println("In Soon method");
	   }
}
