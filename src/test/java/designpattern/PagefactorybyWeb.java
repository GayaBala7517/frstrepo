package designpattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PagefactorybyWeb {
	
public static WebElement username;

public static WebElement password;

public static WebElement button;

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
	
	
	PageFactory.initElements(driver, PagefactorybyWeb .class);
	
	username.sendKeys("selenium");
	password.sendKeys("123");
	button.click();
}




}
