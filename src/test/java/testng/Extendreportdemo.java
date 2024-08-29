package testng;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extendreportdemo {
	static WebDriver driver;
	ExtentReports extent;
	static ExtentTest test;
	@BeforeTest
	public void setup() {
		
	// directory where output is to be printed
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\reprt\\entendreport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test
	public void login() throws IOException {
		
	   test = extent.createTest("Navigate to the google page").assignAuthor("user").assignCategory("regression");   
	   driver.get("https://www.google.com/");
	   
	   test.log(Status.INFO, "user is getting the title");
	   
	    String actualtitle = driver.getTitle();
	    String expecttitle = "Googlle";
	    
	    if(actualtitle.equals(expecttitle)) {
	    	
	    	test.log(Status.PASS, "Title Matched");
	    }else {
	    	test.log(Status.FAIL,"Title mismatched");
	    	takeScreenshot();
	    	
	    }
	   
	   }
@Test
	
	public void test2() {
		test = extent.createTest("Login page").assignAuthor("user2").assignCategory("sanity").assignDevice("windows11");
		
		test.log(Status.INFO, "user is logged in");
		
		test.log(Status.PASS, "test case passed");
		
	}
	
	@AfterTest
	
	public void tearDown() {
		
extent.flush();
	}

public static void takeScreenshot() throws IOException {
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy h-m-s");
	Date date = new Date(0, 0, 0);
	
	TakesScreenshot tks = (TakesScreenshot) driver;// casting
	
	File image = tks.getScreenshotAs(OutputType.FILE);
	
	
	//File dest = new File("./screenshot/facebook"+System.currentTimeMillis()+".png");
	
	File dest = new File("./screenshot/google"+ formatter.format(date)+".png");
	
	
	FileUtils.copyFile(image, dest);
	
	test.log(Status.FAIL , MediaEntityBuilder.createScreenCaptureFromPath(dest.getAbsolutePath()).build());
	
	
	
}
	
}