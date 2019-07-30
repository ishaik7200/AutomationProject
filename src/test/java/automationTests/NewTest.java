package automationTests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void titleTest() {
	  
	  	WebDriver driver;
		driver = new HtmlUnitDriver();
		driver.get("https://www.google.com/");	
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);
	  
	  
	  
	  
  }
}