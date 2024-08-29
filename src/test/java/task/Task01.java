package task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Task01 {
            public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://minimals.cc/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
    WebElement signin = driver.findElement(By.linkText("Sign in"));
     signin .click();
     WebElement sgnin  = driver.findElement(By.id(":r3j:"));
     sgnin.click();   
     WebElement order  = driver.findElement(By.xpath("//span[text()='Order']"));
     order.click();
     WebElement list   = driver.findElement(By.xpath("//span[text()='List']"));
     list.click();
     WebElement searchinput   = driver.findElement(By.id(":r3r:"));
      searchinput.sendKeys("Lucian obrien");
      WebElement prntstatus   = driver.findElement(By.id("['root__layout /div[2]/main/div/div[2]/div[4]/div/div[1]/div[2]/div/div/div/table/thead/tr/th[7]/span']"));
      System.out.println(prntstatus.getText());
}
						}

