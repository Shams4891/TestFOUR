package ffm_login_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ffm_login.Add_SuperAdmin;
import ffm_login.Log_In;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Log_In_Test {
	
	
	public static void main (String [] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://104.248.53.138/");
		
		
		
		Log_In loginObj = new Log_In (driver);
		
		
		loginObj.oTmember();
		
		Add_SuperAdmin oBj = new Add_SuperAdmin (driver);
		Thread.sleep(5000);
		oBj.register();
		
	}
	
	
	

	}


