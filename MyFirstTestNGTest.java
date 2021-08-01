package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class MyFirstTestNGTest {
	WebDriver driver;
  @Test
  public void wikiTest() {
	    driver.get("https://www.wikipedia.org/");
		driver.findElement(By.id("js-link-box-en")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Selenium");
		driver.findElement(By.id("searchButton")).click();
		String expectedOutput= "Selenium";
		String actualOutput = driver.findElement(By.id("firstHeading")).getText();
		assertEquals(actualOutput,expectedOutput);
		
/*		if (expectedOutput.equals(actualOutput)) {
			System.out.println("Heading Test Case Passed");
		}
		else {
			System.out.println("Heading Test Case Failed");
		}*/
		String expectedPageTitle = "Selenium - Wikipedia1";
		String actualPageTitle = driver.getTitle();
		
/*		if (expectedPageTitle.equals(actualPageTitle)) {
			System.out.println("Page Title test Case Passed");
		}
		else {
			System.out.println("Page Title Test Case Failed");
		}*/
		//assertEquals(actualPageTitle,expectedPageTitle);
		assertEquals(actualPageTitle,expectedPageTitle,"Expected title does not match with a page");
		
  }
  
  //@Test
  public void googleTest() {
	  driver.get("https://www.google.com/");
	  driver.findElement(By.tagName("q")).sendKeys("Selenium Jobs");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  /*System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Webdrivertraining\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();*/
	  
	  System.out.println("Inside Before Method");
 }
	  
  @BeforeClass
  public void onlyOnceBeforeFirstMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Webdrivertraining\\test\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
  }
	  	

  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
	  System.out.println("Inside After Method");
	    
  }
  @AfterClass
  public void afterLastTest() {
	  driver.quit();
	  
	  
  }

}
