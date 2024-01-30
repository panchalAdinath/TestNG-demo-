package TestNGRev;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class GoogleParameters {
	
	@Test
	@Parameters({"pl","tool"})
	public void GoogleParam(String pl,String tool)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.google.com");
		
		WebElement searchBox= driver.findElement(By.name("q"));
		
		searchBox.sendKeys(pl +" "+ tool);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.close();
		
		List<WebElement> elements= driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
		
		System.out.println("Total size: "+elements.size());
		
		for(WebElement el:elements)
		{
			System.out.println(el.getText());
		}
	}
}
