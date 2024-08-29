package designpattern;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tasklogintest extends Taskbaseclass {
	@Test(priority = 0)
	public void loginCheck() {
		
		loginPage.login();
			
	}
	
	@Test(priority = -1)
	public void titleCheck() {
		String actualTitle = loginPage.getdemotitle();
		String expectedTitle = "OrangeHRM";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(priority = 2)
	public void urlCheck() {
		String actualurl = loginPage.getUrl();
		String expectedUrl ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" ;
		Assert.assertEquals(actualurl, expectedUrl);
	}


}
