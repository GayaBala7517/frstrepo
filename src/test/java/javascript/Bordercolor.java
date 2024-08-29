package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bordercolor {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].value = 'selenium@gmail.com';", userName);
		
		jse.executeScript("arguments[0].style.border='5px solid red';", userName);
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		String bgColor = loginBtn.getCssValue("backgroundColor");
		System.out.println(bgColor);
		String color = loginBtn.getCssValue("color");
		System.out.println(color);
		
		String newBgColor = "rgb(168, 50, 62)";
		
		for(int i=1; i<100; i++) {
		jse.executeScript("arguments[0].style.backgroundColor= '"+newBgColor+"'; ", loginBtn);
		jse.executeScript("arguments[0].style.backgroundColor= '"+bgColor+"'; ", loginBtn);
		}
	}


}
