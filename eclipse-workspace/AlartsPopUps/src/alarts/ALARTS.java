package alarts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ALARTS {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.hyrtutorials.com/p/alertsdemo.html ");
		driver.manage().window().maximize();
		
		
		  driver.findElement(By.xpath("//*[@id=\"alertBox\"]")).click();
		  
		  Thread.sleep(5000);
		 
		  
		 Alert simplealert =    driver.switchTo().alert();
		 
		
		 
		// System.out.println(simplealert.getText());
		 
		 Thread.sleep(5000);
		 simplealert.accept();
		
		
		
		
		
		
	}

}
