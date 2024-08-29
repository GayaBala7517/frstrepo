package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertsoft {
	@Test
	public void soft() {
		  SoftAssert  s = new SoftAssert();
		  s.assertEquals(true, true);
		  System.out.println("output is");
		  s.assertAll();
	}

}
