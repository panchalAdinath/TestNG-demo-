package ParametersDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssignmentParam {
	
	WebDriver driver;
	@Test
	@Parameters({"keyword"})
	public void testcase1(String searchData)
	{
		driver=new EdgeDriver();
		driver.get("https://www.google.com");
		
		WebElement searchBox= driver.findElement(By.name("q"));
		searchBox.sendKeys(searchData);
		
		Assert.assertEquals(searchData,searchBox.getAttribute("value"));
		System.out.println("Test case pass");
		driver.quit();
		
		
	}
	
	
}
