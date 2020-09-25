package com.rameshsoft.selenium.pack4;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTestFile 
{
    @Parameters("var")
	@Test
	public void hello(int a) 
	{
	   System.out.println("In hello method and A value is:"+a);
	}
		
    @Parameters({"num","nam"})
    @Test
    public void test(int a, String name)
    {
    	System.out.println("Multiple parameters:-->Int val:"+a+"***"+"Name:"+name);
    }
    
    @Parameters({"abc","xyz"})
    @Test
    public void defaultvalues(@Optional("98.33")double d, @Optional("Hyd")String add)
    {
    	System.out.println("Printing default values if values are not supplied from XML file:");
    	System.out.println("Double val:" +d+"****"+"String add:"+add);
    }
    
}
