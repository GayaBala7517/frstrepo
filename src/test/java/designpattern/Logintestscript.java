package designpattern;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintestscript extends Baseclass{
	
	@Test(priority = 0)
	public void loginCheck() {
		
		String actualtext = loginclass.login();
		String expectedText = "The password that you've entered is incorrect. Forgotten password?";
		Assert.assertEquals(actualtext, expectedText);
		
	}
	
	@Test(priority = -1)
	public void titleCheck() {
		String actualTitle = loginclass.getFbTitle();
		String expectedTitle = "Facebook – log in or sign up";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test
	public void urlCheck() {
		String actualurl = loginclass.getUrl();
		String expectedUrl ="https://www.facebook.com/" ;
		Assert.assertEquals(actualurl, expectedUrl);
	}

}
