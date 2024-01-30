//package ParametersDemo;
package ParametersDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class DataProviderDemo 
{
	
	@DataProvider(name = "searchDataSet")
	public Object[][] searchData()
	{
		Object[][] searchKeyword=new Object[3][2];
		searchKeyword[0][0]="Maharashtra";
		searchKeyword[0][1]="Shivneri";
		
		searchKeyword[1][0]="Rajasthan";
		searchKeyword[1][1]="Jantar-Mantar";
		
		searchKeyword[2][0]="Uttarpradesh";
		searchKeyword[2][1]="Shri Ram Mandir";
		
		return searchKeyword;
		
		
		
	}

	@Test(dataProvider = "searchDataSet")
	public void GoogleSearchDemo(String state,String monument)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		WebElement searchBox= driver.findElement(By.name("q"));
		
		//enter keycombination of state and monument
		searchBox.sendKeys(state+" "+monument);
		
		driver.findElement(By.xpath("//input[@tabindex='0']")).submit();
		
		
		driver.close();
	}
}
