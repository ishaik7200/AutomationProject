package automationTests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void titleTest() {
	  
	  	WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
	  	driver = new ChromeDriver();
		
		//driver = new HtmlUnitDriver();
		driver.get("https://www.google.com/");	
		String expectedTitle = "Hello";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);
	  
	  
	  
	  
  }
}
