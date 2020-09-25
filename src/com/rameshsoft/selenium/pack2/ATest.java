package com.rameshsoft.selenium.pack2;

import org.testng.annotations.Test;

public class ATest 
{
	   @Test(groups = {"RR","SS","EE"})
	   public void hello()
	   {
		   System.out.println("In Hello Method");
	   }
	   
	   @Test(groups = {"EE","RR"})
	   public void welcome()
	   {
		   System.out.println("In Welcome method");
	   }
	   
	   @Test(groups = {"EE", "SS"})
	   public void bye()
	   {
		   System.out.println("In Bye method");
	   }
	   
	   @Test(groups = {"EE", "RS"})
	   public void soon() 
	   {
		   System.out.println("In Soon method");
	   }
}
