package brokenlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkhandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		int sum = 0;
		for(WebElement link:alltags) {
			
			String urlStr = link.getAttribute("href");
			int flag = Brokenlinkchecker.linkChecker(urlStr);
			
			sum += flag;
			
		}System.out.println("Broken links count "+ sum);
	}

}
