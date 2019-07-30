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
		System.out.println("Hi1");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
		System.out.println("Hi2");
	  	driver = new ChromeDriver();
		System.out.println("Hi3");
		
		//driver = new HtmlUnitDriver();
		driver.get("https://www.google.com/");	
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);
	  
	  
	  
	  
  }
}
