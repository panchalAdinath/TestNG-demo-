package ParametersDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment2 {
	WebDriver driver;
	@Test
	@Parameters({"country"})
	public void testcase1(String searchData) throws InterruptedException
	{
		driver=new EdgeDriver();
		//maximize window
		driver.manage().window().maximize();
		
		//open browser
		driver.get("https://www.google.com");
		
		//find webelemnt and enter data
		WebElement element= driver.findElement(By.name("q"));
		element.sendKeys(searchData);
		Thread.sleep(2000);
		
		//get value attribute
		String valueOfString= element.getAttribute("value");
		
		//Validate searchData and value entered
		Assert.assertEquals(searchData,valueOfString);
		
		List <WebElement> list= driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
		System.out.println("Total Options: "+list.size());
		
		System.out.println("Suggested options for "+searchData+" :");
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("Test Pass");
		
		driver.close();
		
	}
}
