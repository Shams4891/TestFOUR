package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	
	
	
	@Test(dataProvider ="TestData")
	
	public void test2 ( String  a , String b , int c ) {
		
		
		System.out.println(a + ""+ b + "" +  c);
		
	}

	
        @DataProvider(name= "TestData")
        
        public Object test1 () {
        	
        	Object [][]  data = {{ "shams", "tasvir" ,1}, {"USA", "FORD" , 2} , { "Japan " , "Toyota " , 3 }};
        	
        	return data ;
        	
        	
        	
        }
	  
	   
	
	

	

	
}
