package ffm_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_SuperAdmin {

	
	 WebDriver driver;
	 
	@FindBy (xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[3]/a/span")
	WebElement addBtn;
	@FindBy(xpath = "//*[@id=\"kt_content\"]/div/div/form/div[1]/input")
	WebElement firstName;
	@FindBy (xpath = "//*[@id=\"kt_content\"]/div/div/form/div[2]/input")
	WebElement lastName;
	@FindBy (xpath = "//*[@id=\"kt_content\"]/div/div/form/div[3]/input")
	WebElement emailElement;
	@FindBy(xpath ="//*[@id=\"kt_content\"]/div/div/form/div[4]/input") 
	WebElement passWord;
	@FindBy (xpath ="//*[@id=\"kt_content\"]/div/div/form/button")
	WebElement registerBtn;
	
	
	
	          
	 public Add_SuperAdmin  (WebDriver driver) {
		 
		 this.driver = driver;
		 
		 PageFactory.initElements(driver, this);
		 
		 
	 }
	
	
	public   void register ()  {
		
	addBtn.click();
	firstName.sendKeys("john1");
	lastName.sendKeys("snow1");
	emailElement.sendKeys("shamstasvir091@email.com");
	passWord.sendKeys("123456");
	//Thread.sleep(4000);
	registerBtn.click();	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
