package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taskdatachild extends Taskdtaparent {
	
@Test(dataProvider = "parentData")
	public void login(String name, String pass) 
{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
