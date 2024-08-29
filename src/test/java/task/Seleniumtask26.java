package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumtask26 {
            public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://minimals.cc/");
	driver.manage().window().maximize();
    WebElement Signing    = driver.findElement(By.xpath("//*[@id=':r6m:']"));
     Actions act = new Actions (driver);
     act.moveToElement(Signing).click().perform();
    
   // WebElement order  = driver.findElement(By.xpath("//span[text()='Order']"));
     //act.moveToElement(order).click().perform();
    
     //WebElement list   = driver.findElement(By.xpath("//span[text()='List']"));
    // act.moveToElement(list).click().perform();
    
     //WebElement searchinput   = driver.findElement(By.xpath("//input[@type='text'])[3]"));
    //searchinput.sendKeys("Lucian obrien");
    //WebElement name    = driver.findElement(By.xpath("//span[text()='Lucian Obrien']"));
   
      
	
}
}
