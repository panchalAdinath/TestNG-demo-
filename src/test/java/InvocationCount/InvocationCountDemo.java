package InvocationCount;


import org.testng.ITestContext;
import org.testng.annotations.Test;

public class InvocationCountDemo {
	
	@Test(invocationCount = 2)
	public void test1(ITestContext context) 
	{	
		int currentInvocationCount= context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Executing: "+currentInvocationCount);
		System.out.println("This is testcase1");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("This is testcase2");
	}
}
