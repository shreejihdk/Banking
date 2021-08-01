package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 
Test cases:
1.Go to https://www.wikipedia.org/
2.Click on English link
3.Type "Selenium" on search box
4.Click on Search icon
5.Verify that "Selenium - Wikipedia"

 */

public class MyFirstSeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workspace\\Webdrivertraining\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		/*WebElement EnglishLink = driver.findElement(By.id("js-link-box-en"));
		EnglishLink.click();*/
		driver.findElement(By.id("js-link-box-en")).click();
		driver.findElement(By.id("searchInput")).sendKeys("Selenium");
		driver.findElement(By.id("searchButton")).click();
		String expectedOutput= "Selenium";
		String actualOutput = driver.findElement(By.id("firstHeading")).getText();
		driver.findElement(By.id("searchInput")).sendKeys("Python");
		driver.findElement(By.id("searchButton")).click();
		//commentgittest
		
		

	}

}
 