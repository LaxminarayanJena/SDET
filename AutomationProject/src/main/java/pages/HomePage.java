package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;



public class HomePage extends BasePage{
	static final Logger log = LogManager.getLogger(HomePage.class);
	
	public HomePage() {
		super();
		
	}

	public void search(String searchTerm){
		log.debug("Inside the page object model");
		WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(searchTerm);
        element.submit();
	}

}
