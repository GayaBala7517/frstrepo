package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {
	public static void main (String[] args) {
		
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://jqueryui.com/datepicker/");
    driver.manage().window().maximize();
   driver.switchTo().frame(0);
    
    WebElement input = driver.findElement(By.id("datepicker"));
    input.sendKeys("07/25/2024");
    input.click();
  
   String month = "May";
   String date = "07";
   String year = "2023";
   
   while(true) {
		String mon = driver.findElement(By.xpath("//span[@class ='ui-datepicker-month']")).getText();
		String yr = driver.findElement(By.xpath("//span[@class ='ui-datepicker-year']")).getText();
		if(mon.equals(month) && yr.equals(year)) {
			break;
		}
		WebElement prevBtn = driver.findElement(By.xpath("//span[text() = 'Prev']"));
		prevBtn.click();	
		
		}	
      List<WebElement> allDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tr/td/a"));
		
		for(WebElement dateElement: allDates) {
			String dateStr = dateElement.getText();
			if(dateStr.equals(date)) {
				dateElement.click();
			}
			
			
		}
	}

}
