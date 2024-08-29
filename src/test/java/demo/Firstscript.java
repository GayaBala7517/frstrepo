
                    //working without Webdrivermanager with selenium 4.11.0 version
package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
}
}
