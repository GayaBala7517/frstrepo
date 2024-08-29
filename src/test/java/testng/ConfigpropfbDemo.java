package testng;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigpropfbDemo {
	WebDriver driver;
	
	Properties pro;
@BeforeTest	
	public void setup() throws IOException
	{
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\ConfigFiles\\config.properties");
		
		FileReader fr= new FileReader(f);
		
	    pro = new Properties();
		
		pro.load(fr);
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get(pro.getProperty("url"));
				
	}
@Test
	public void login() {
	
		driver.findElement(By.id("email")).sendKeys(pro.getProperty("username"));
		
		driver.findElement(By.id("pass")).sendKeys(pro.getProperty("password"));
		
		driver.findElement(By.name("login")).click();
		
	}
@AfterTest

  public void closWindow() {
	driver.close();	
}}
