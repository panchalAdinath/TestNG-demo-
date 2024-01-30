package ParametersDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class DataProviderMethod {
	
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
	
}
