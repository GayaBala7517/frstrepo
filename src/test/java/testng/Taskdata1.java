package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taskdata1 extends Taskdataparet {
	@Test(dataProvider = "credentialData")
	public void login(String name, String pass) {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new  ChromeDriver();
			
		driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys(name);
			
			driver.findElement(By.id("pass")).sendKeys(pass);
			
			driver.findElement(By.name("login")).click();

		
	}
	


}
