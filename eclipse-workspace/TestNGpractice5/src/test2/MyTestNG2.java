package test2;

import org.testng.annotations.Test;

public class MyTestNG2 {
	
	
	
	
	@Test (groups= "sanity")
	public void test1() {
		System.out.println("Sanity");}

	@Test (groups= "smoke")
		public void test2() {
			System.out.println("Sanity");}

	@Test (groups= "smoke")
			public void test3() {
				System.out.println("Sanity");}

	@Test (groups=  {"sanity" , "regression" })
				public void test4() {
					System.out.println("Sanity");}

	@Test(groups = "sanity")
	public void test5() {
		System.out.println("Sanity");
	}
}
