package testng;

import org.testng.annotations.Test;

public class Parallelclass3 {
	@Test(groups = "regression")

	public void testMethod5(){
	
	System.out.println("5 The Thread is:"+Thread.currentThread().getId());
	System.out.println("testmethod5");
}

	@Test(groups = "smoke")

public void testMethod6(){
	
	System.out.println("6 The Thread is:"+Thread.currentThread().getId());
	System.out.println("testmethod6");
	
}


}
