package test3;

import org.testng.annotations.Test;

public class Mytest {
	
	
	@Test(groups = {"regression","sanity" })
	public void test1() {
		System.out.println("Sanity");
	}

	@Test(groups = "smoke")
	public void test2() {
		System.out.println("Sanity");
	}

	@Test(groups = {"smoke" , "Regression" })
	public void test3() {
		System.out.println("Sanity");
	}

	@Test(groups = { "sanity", "regression" })
	public void test4() {
		System.out.println("Sanity");
	}

	@Test(groups = "sanity")
	public void test5() {
		System.out.println("Sanity");

	}
	
	
	
	
	
	
	
	
	

}