package test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTestNG1 {
		
	@BeforeClass 	
	 public  void beforeclass () {
		 
		 System.out.println("Before Class1");
	 }		
	@BeforeMethod
	
	 public  void beformethod () {
		 
		 System.out.println("Before Method 1");
	 }	
	 @Test
	 
	 public  void testcase1 () {
		 
		 System.out.println("Test Case One");
	 }	 
	 @AfterMethod
		
	 public  void aftermethod () {
		 
		 System.out.println("Aftermethod 1");
	 }
	
	 @AfterClass
		
	 public  void afterclass () {
		 
		 System.out.println("After Class1");
	 }
	

}
