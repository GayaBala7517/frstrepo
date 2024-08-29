package designpattern;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagefactorydemo {

	@FindBy(name = "username")
	public static WebElement Username;
	
	@FindBy(name = "password")
	public static WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement loginbtn;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, Pagefactorydemo.class);

		Username.sendKeys("testng@gmail.com");
		Password.sendKeys("1223455");
		loginbtn.click();
		

		
	}
}