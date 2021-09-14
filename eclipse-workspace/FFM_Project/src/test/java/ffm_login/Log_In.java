package ffm_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_In {
	
	
	WebDriver driver;
	
	@FindBy (id ="login")
	WebElement emailElement;
	@FindBy (id ="password")
	WebElement passwordElement;
	@FindBy (xpath ="//*[@id=\"formContent\"]/form/input[3]")
	WebElement loginBTN;
	
	
	
	
	 
	public Log_In (WebDriver driver){		
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
				
	}
	
	
	public  void oTmember () {
		
		
		emailElement.sendKeys("superadmin@email.com");
		passwordElement.sendKeys("sadmin1122");
		loginBTN.click();
		
		
	}
		
	


	}


	



	








