package mouseactions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightclick {
	public static void main(String[]args) {
   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.google.com/");

		
	}

}
