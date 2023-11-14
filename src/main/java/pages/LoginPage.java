package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
		//Type 1
		//elements
		
		@FindBy(how=How.XPATH,using="//input[@id='username']") WebElement USERNAME_ELEMENT;
		@FindBy(how=How.XPATH,using="//input[@name='user_name' and @class='form-control']")WebElement USERNAME_ELEMENT1;
		@FindBy(how=How.XPATH,using="//input[@id='password']") WebElement PASSWORD_ELEMENT;
		@FindBy(how=How.XPATH,using="//input[@name='password' and @class='form-control']")WebElement PASSWORD_ELEMENT1;
		@FindBy(how=How.NAME,using="login") WebElement SUBMIT_ELEMENT;
		@FindBy(how=How.XPATH,using="//button[@class='btn btn-primary btn-block btn-flat']")WebElement SUBMIT_ELEMENT1;
		
		//Intractable methods
		
		public void insertLoginInfo(String username,String password) {
			USERNAME_ELEMENT.sendKeys(username);
			PASSWORD_ELEMENT.sendKeys(password);
		}
			
		public void clickSignInButton() {
			SUBMIT_ELEMENT.click();
		}
	//Type 2	
		public void performLogin(String username,String password) {
			USERNAME_ELEMENT.sendKeys(username);
			PASSWORD_ELEMENT.sendKeys(password);
			SUBMIT_ELEMENT.click();
		}
}
