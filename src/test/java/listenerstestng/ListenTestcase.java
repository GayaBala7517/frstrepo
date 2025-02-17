package listenerstestng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListenTestcase {

	static WebDriver driver;
	static TakesScreenshot tks;
	
@BeforeTest	
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
@Test	
	public void login() {
		driver.findElement(By.id("email")).sendKeys("gayathri@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234567");
		String actual = driver.getTitle();
	    String expected = "Facebook – log in or sign";
		
		Assert.assertEquals(actual, expected);
	}
      public static void captureScreenShot() throws IOException {
	
	 tks = (TakesScreenshot) driver;
	File image = tks.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/facebook.png");
	
	FileUtils.copyFile(image, dest);
	
}	
}



