package AnnotationsDemo;

import org.testng.annotations.*;

public class TestCase1 {
	
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("before suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is before Test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@Test
	public void test01()
	{
		System.out.println("This is test case 1");
	}
	
	@Test
	public void test02()
	{
		System.out.println("This is test case 2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("after class");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("This is after Test");
	}
	
	@AfterSuite
	public void AfterSuit()
	{
		System.out.println("After suite");
	}
}
