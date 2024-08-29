package designpattern;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeSuite;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Taskbaseclass {
		public static WebDriver driver;
		public static Taskloginclass loginPage = new Taskloginclass();
		@BeforeSuite
		public void setUp() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
			
		}

	}

