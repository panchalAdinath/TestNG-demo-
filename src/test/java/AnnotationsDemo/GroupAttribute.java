package AnnotationsDemo;

import org.testng.annotations.Test;

public class GroupAttribute {
	
	@Test(groups = "Software Company")
	public void infosys()
	{
		System.out.println("Infosys");
	}
	
	@Test(groups = "Software Company")
	public void wipro()
	{
		System.out.println("wipro");
	}
	
	@Test(groups = "Automobile Company")
	public void maruti()
	{
		System.out.println("maruti");
	}
	
	@Test(groups = "Automobile Company")
	public void tata()
	{
		System.out.println("tata");
	}
	
	
	
	
}
