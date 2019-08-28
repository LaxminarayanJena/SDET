package ParallelTesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * 
 *
 */
public class TestNGParallelTests {
	
	WebDriver driver =null;
	@BeforeClass
	void setUpClass() { 
		System.setProperty("webdriver.chrome.driver", "/software/chromedriver");
	}
	
	@Test
	void calcTest() {
        WebDriver driver = new ChromeDriver();        
        driver.get("http://www.google.com");                
        
        WebElement element = driver.findElement(By.name("q")); 
        element.sendKeys("sqrt 16");
        element.submit();
        
        WebElement result = driver.findElement(By.id("cwos"));
        AssertJUnit.assertEquals(result.getText(), "4");
	}
	
	@Test
	void searchTest() {   
        WebDriver driver = new ChromeDriver();        
        driver.get("http://www.google.com");                
        
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Selenium WebDriver");
        element.submit();
        
        AssertJUnit.assertTrue(driver.getTitle().startsWith("Selenium WebDriver"));
	}

}
