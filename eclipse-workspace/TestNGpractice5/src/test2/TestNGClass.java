package test2;

import org.testng.annotations.Test;

public class TestNGClass {
	
	@Test (groups= "sanity")
	public void test1() {
		System.out.println("Sanity");}

	@Test (groups= {"smoke" ,"sanity" })
		public void test2() {
			System.out.println("Sanity");}

	@Test (groups= {"smoke" , "regression"})
			public void test3() {
				System.out.println("Sanity");}

	@Test (groups=  {"sanity" , "regression" })
				public void test4() {
					System.out.println("Sanity");}

	@Test(groups = {"sanity" ,"smoke" })
	public void test5() {
		System.out.println("Sanity");

}
}
