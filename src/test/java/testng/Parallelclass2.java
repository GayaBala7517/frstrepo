package testng;

import org.testng.annotations.Test;

public class Parallelclass2 {
	@Test(groups = {"sanity", "regression"})

public void testMethod3(){
		
		System.out.println("3 The Thread is:"+Thread.currentThread().getId());
		System.out.println("testmethod3");
	}

	@Test(groups = "random")

public void testMethod4(){
		
		System.out.println("4 The Thread is:"+Thread.currentThread().getId());
		System.out.println("testmethod4");
		
	}


}
