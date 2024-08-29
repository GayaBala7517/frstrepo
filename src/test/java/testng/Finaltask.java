package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Finaltask {
	@Test(dataProvider = "credentialData")
  public void login(String name, String pass) {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new  ChromeDriver();
			
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("submit")).click();
	
		String actual = "user";
	    String expected = "password";
		Assert.assertEquals(actual,expected);
		System.out.println("valid data for login");
		Assert.assertNotEquals(actual,expected);
	    System.out.println("invalid data for login");
	}	


	@DataProvider
	public Object[][] credentialData() {
			
		Object[][]  arr= {{"user", "password"}};
		
		return arr;
	}

}
