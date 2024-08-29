package testng;

import org.testng.annotations.Test;

public class Parallelclass1 {
	@Test(groups = "smoke")
	public void testMethod1(){
		
		System.out.println("1 The Thread is:"+Thread.currentThread().getId());
		System.out.println("testmethod1");
	}

	@Test(groups = "regression")
public void testMethod2(){
		
		System.out.println("2 The Thread is:"+Thread.currentThread().getId());
		System.out.println("testmethod2");
		
	}

}
