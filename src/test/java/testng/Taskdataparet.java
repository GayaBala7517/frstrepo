package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Taskdataparet {
	@Test
	@DataProvider
public Object[][] credentialData() {
		
		
		Object[][]  arr= {{"testng@gmail.com", "123"}, {"selenium@gmail.com", "456"}, {"java@gmail.com", "789"}};
		
		return arr;
	
}
}
