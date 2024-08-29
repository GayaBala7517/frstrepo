package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Attributespractice 
{  //to create new gmail account
	@Test (priority = -6, description = "login to gmail page")
	public void login() {
		System.out.println("login");
	}
	@Test(priority = -5 )
    public void signin() {
    	System.out.println("sign in to gmail page");
	}
	@Test (priority = -4, invocationCount = 3, timeOut = 1000)
    public void createaccount() throws InterruptedException {
		Thread.sleep(2000);
    	System.out.println("create New account");		
	}
	@Test (priority = -3)
    public void name() {
    	System.out.println("enter the name");
    	Assert.assertEquals(true, false);
	
}
	@Test (priority = -2, dependsOnMethods = "name", alwaysRun = true)
    public void usernme() {
    	System.out.println("enter valid username");
	
}
	@Test (priority = -1)
    public void passwrd() {
    	System.out.println("enter the password");
}
	@Test (priority = 0)
    public void confirm() {
    	System.out.println("confirm passwrd");
}
	@Test (priority = 1, enabled = false)
     public void nxt() {
    	 System.out.println("click nxt");
	
}

}
