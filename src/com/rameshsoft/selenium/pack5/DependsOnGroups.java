package com.rameshsoft.selenium.pack5;

import org.testng.annotations.Test;

public class DependsOnGroups 
{

	@Test(groups = {"EE"})
	public void hello()
	{
		System.out.println("In hello method");
	}
	
	@Test(groups = {"EE"})
	public void setData()
	{
		System.out.println("In SetData methd");
	}
	
	@Test(groups = {"RR"})
	public void testData()
	{
		System.out.println("In testData method ");
	}
	
	@Test(groups = {"SS"})
	public void testScreens()
	{
		System.out.println("In testScreens method ");
	}
	
	@Test(groups = {"EE"})
	public void testInput()
	{
		System.out.println("In testInput method ");
	}
	
	
	@Test(groups = {"EE"})
	public void testMotion()
	{
		System.out.println("In testMotion method ");
	}
	
	@Test(groups = "RR", dependsOnGroups = {"EE"})
	public void testOne()
	{
		System.out.println("After depends on groups method");
	}
	
}
