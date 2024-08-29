package designpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Taskloginclass extends Taskbaseclass {

	By Username = By.name("username");
	By Password = By.name("password");
	By loginbtn = By.xpath("//button[normalize-space()='Login']");
	By forgotPwd = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
	
	public void login() {
		driver.findElement(Username).sendKeys("testng@gmail.com");
		driver.findElement(Password).sendKeys("123456");
		driver.findElement(loginbtn).click();
	

	}
	
	public String getdemotitle() {
		
		String actualTitle = driver.getTitle();
		
		return actualTitle;
		
	}
	
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

}

