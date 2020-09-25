package com.rameshsoft.selenium.pack2;

import org.testng.annotations.Test;

public class CTest 
{
	   @Test(groups = {"SS","EE"})
	   public void hello()
	   {
		   System.out.println("In Hello Method");
	   }
	   
	   @Test(groups = {"RR","EE"})
	   public void welcome()
	   {
		   System.out.println("In Welcome method");
	   }
	   
	   @Test(groups = {"SS","EE"})
	   public void bye()
	   {
		   System.out.println("In Bye method");
	   }
	   
	   @Test(groups = {"RR","EE"})
	   public void soon() 
	   {
		   System.out.println("In Soon method");
	   }
}
