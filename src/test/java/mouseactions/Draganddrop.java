package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Draganddrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement italy = ((WebElement) driver).findElement(By.id("box106"));
		
		WebElement washington = ((WebElement) driver).findElement(By.id("box3"));
		
		WebElement us = driver.findElement(By.id("box103"));
		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(rome, italy).dragAndDrop(washington, us).build().perform();
		

	}

}
