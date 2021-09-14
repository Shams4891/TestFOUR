package ffm.web.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {


	public static void main(String[] args) {
		String baseUrl = "http://165.227.200.62/" ;		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		driver.get(baseUrl);
		
		
		driver.manage().window().maximize();
		
		
		
		WebElement emailfield = driver.findElement(By.id("login"));
		emailfield.sendKeys("superadmin@email.com");


	}

}
