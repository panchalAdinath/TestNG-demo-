package AnnotationsDemo;

//import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationAttributes {
	
	//@Test(description = "This is testcase1")
	//@Test(priority = 1)
	//@Test(dependsOnMethods = {"testCase2","testCase3"})
	@Test(enabled = false)
	public void testCase1()
	{
		System.out.println("Mobile login Test Case");
	}
	
	//@Test(priority = 2)
	//@Test(description = "This is testcase2")
	//@Test(timeOut = 200)
	@Test
	public void testCase2()
	{	
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Web login Test Case");
		//Assert.assertTrue(false);
	}
	

	//@Test(description = "This is testcase3")
	//@Test(priority = 3)
	@Test
	public void testCase3()
	{
		System.out.println("API login Test Case");
	}
}
