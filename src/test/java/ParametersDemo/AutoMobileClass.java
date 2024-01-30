package ParametersDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutoMobileClass {
	
	@Test
	@Parameters({"AutoMobileName"})
	public void testcase1(String name)
	{
		System.out.println(name);
	}
}
