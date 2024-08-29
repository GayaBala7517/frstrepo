package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowseDemo {
	WebDriver driver;
	@BeforeTest
@Parameters({"browser"})
	
	public void setup(String browser) {
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			default:
				System.out.println("enter the valid browser name");
				break;
			
		}		
	}	
	@Test
	public void login() {
		driver.get("https://www.facebook.com/");
		System.out.println("Thread id is"+Thread.currentThread().getId());
	}

}
