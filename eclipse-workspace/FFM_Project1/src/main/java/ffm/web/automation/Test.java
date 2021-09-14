package ffm.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args)  {
		
		 	
		   
	 String url = "http://165.227.200.62";
	//  I have to put path before object creation.but can put it after or before variable creation
	 
	 WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	
	 driver.manage().window().maximize();
	 driver.get(url);
	 try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement email = driver.findElement(By.id("login"));
	 email.sendKeys("usr455@example.com");
	 WebElement password= driver.findElement(By.id("password"));
	 
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 password.sendKeys("5566");
	 try {
		Thread.sleep(9000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	 WebElement loginbutton = driver.findElement(By.id("//*[@id=\"formContent\"]/form/input[3]"));
	 loginbutton.click();
	 
	 driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* WebDriver driver  = new ChromeDriver ();
	  String  url = "http://165.227.200.62" ;
	  WebDriverManager.chromedriver().setup();
	 
	  
	  driver.manage().window().maximize();
	  driver.get(url); */
		
		
		/*String  url = "http://165.227.200.62" ;
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver ();
		 driver.manage().window().maximize();
		 driver.get("url"); */
		
		
	  
	  

	}

}
