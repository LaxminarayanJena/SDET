package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest {
	static final Logger log = LogManager.getLogger(HomePageTest.class);
	HomePage homePage = new HomePage();
	
	
	@Test
	public void search()
	{
		log.debug("before search");
		homePage.search("selenium");
	}
	
}
