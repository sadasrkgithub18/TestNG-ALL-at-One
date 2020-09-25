package com.rameshsoft.selenium.pack4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClassTest 
{
	
   
   @Test(dataProvider="setData")	
   public void gmLogin(String un, String pwd)
   {
	   System.out.println("DataProvider check");
	   System.out.println("Un is:"+un);
	   System.out.println("Pwd is:"+pwd);
   }
   
   @DataProvider
   public Object[][] setData()
   {
	 Object[][] obj = new Object[4][2];
	 
	 obj[0][0] = "srk";
	 obj[0][1] = "123";
	 obj[1][0] = "KSR";
     obj[1][1] = "987";
     obj[3][0] = "KCR";
     obj[3][1] = "119";
	   
	return obj;
	   
   }
   
}
