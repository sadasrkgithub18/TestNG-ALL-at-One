package com.rameshsoft.selenium.pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A 
{
   @BeforeSuite
   public void beforeSuite() 
   {
	   System.out.println("Before Suite method");
   }
   
   @BeforeTest
   public void beforeTest()
   {
	   System.out.println("Before test method");
   }
   
   @BeforeClass
   public void beforeClass()
   {
	   System.out.println("Before class method");
   }
   
   @BeforeMethod
   public void beforeMethod() 
   {
	   System.out.println("Before method");
   }
   
   @Test
   public void testOne()
   {
	   System.out.println("In Test Case 1 method");
   }
   
   @Test
   public void testTwo()
   {
	   System.out.println("In Test Case 2 method");
   }
   
   
   @AfterMethod
   public void afterMethod() 
   {
	   System.out.println("After method");
   }
   
   @AfterMethod
   public void afterMethod2() 
   {
	   System.out.println("After method 2");
   }
   
   @AfterClass
   public void afterClass()
   {
	   System.out.println("After class method");
   }
   
   
   @AfterTest
   public void afterTest()
   {
	   System.out.println("After test method");
   }
   
   @AfterSuite
   public void afterSuite() 
   {
	   System.out.println("After Suite method");
   }
   
   
}
