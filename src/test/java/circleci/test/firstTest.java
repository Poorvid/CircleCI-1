package circleci.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class firstTest {

	WebDriver driver;

	@BeforeTest
	void setupClass()
	{
		
		System.setProperty("webdriver.chrome.driver", "lib/chromedriverl2");
		ChromeOptions options = new ChromeOptions();options.addArguments("--headless");
		driver = new ChromeDriver(options);
		//driver = new ChromeDriver();
	}

	
	@Test
	void test() {
		driver.get("https://www.google.com/");
		driver.quit();
	}

}
