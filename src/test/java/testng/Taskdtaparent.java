package testng;

import org.testng.annotations.DataProvider;

public class Taskdtaparent {
	@DataProvider
	public Object[][] parentData() {
		
		Object[][] arr= {{"oranium@gmail.com","1234"}, {"softcourses@gmail.com","4567"}, {"testing@gmail.com","5677"}};
		
		return arr;
	}

}
