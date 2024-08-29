package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Executordemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement register = driver.findElement(By.linkText("Register"));
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 
		 jse.executeScript("arguments[0].click();",register);
		 
		 
		 

	}

}
