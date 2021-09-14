package ffm_login_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ffm_login.Add_SuperAdmin;
import ffm_login.Log_In;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SuperAdmin_Test {

	public static void main(String[] args) {
		
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver ();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://104.248.53.138/");
		 
		 		 
		 Log_In login = new Log_In (driver);
		 
		 login.oTmember();
		 
 Add_SuperAdmin superAdmin = new Add_SuperAdmin (driver);
		 
		 
		 superAdmin.register();

	}

}
