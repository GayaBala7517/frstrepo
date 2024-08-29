package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserttask01 {
	@Test
	public void hard() {
		//Assert.assertEquals(445,445);
		//Assert.assertNotSame(23,23);
		//Assert.assertEquals(true,false);
		//Assert.assertSame(true,true);
		//Assert.assertNull(56,true);
		Assert.assertNotNull(45);
		System.out.println("first test output");
		
	}

}
