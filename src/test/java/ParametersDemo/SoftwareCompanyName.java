package ParametersDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SoftwareCompanyName {
	
	@Test
	@Parameters({"SoftwareCompany"})
	public void testCase1(String name)
	{
		System.out.println(name);
	}
}
