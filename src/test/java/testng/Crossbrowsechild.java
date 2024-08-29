package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Crossbrowsechild 
//extends CrossBrowseDemo 
{
	WebDriver driver;
	@Test
	public void login() {
			
		driver.get("https://www.facebook.com");
		
	}

}
