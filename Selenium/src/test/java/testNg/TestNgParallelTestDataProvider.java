package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgParallelTestDataProvider {
	
	@BeforeClass
	void setUpClass()
	{
		System.setProperty("webdriver.chrome.driver", "/software/chromedriver");	
	}
	
	@DataProvider(name="browsers",parallel=true)
	Object[][] testBrowsers()
	{
		return new Object[][]
		{
			{"selenium"},{"jena"}
		};
		
	}
	
	@Test(dataProvider="browsers")
	void searchTest(String searchText)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys(searchText);
		element.submit();
		
		System.out.println(searchText+":"+Thread.currentThread().getId()+":"+Thread.currentThread().getName());
				
		
	}

}
