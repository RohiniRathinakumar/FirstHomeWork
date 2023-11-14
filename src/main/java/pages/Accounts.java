package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Accounts extends BasePage {
	WebDriver driver;
	 
	public  Accounts(WebDriver driver) {
		this.driver=driver;
	}
	
	  @FindBy(how=How.XPATH,using="//input[@id='account']") WebElement ACCOUNT_TITLE_ELEMENT;
	  @FindBy(how=How.XPATH,using="//input[@id='description']") WebElement	DESCRIPTION_ELEMENT;
	  @FindBy(how=How.XPATH,using="//input[@id='balance']") WebElement BALANCE_ELEMENT;
	  @FindBy(how=How.XPATH,using="//input[@id='account_number']") WebElement ACCOUNT_NUMBER_ELEMENT;
	  @FindBy(how=How.XPATH,using="//input[@id='contact_person']") WebElement CONTACT_PERSON_ELEMENT;
	  @FindBy(how=How.XPATH,using="//input[@id='contact_phone']") WebElement CONTACT_PHONE_ELEMENT;
	  @FindBy(how=How.XPATH,using="//input[@id='ib_url']") WebElement URL_ELEMENT;
	  @FindBy(how=How.XPATH,using="	//button[@class='btn btn-primary']") WebElement SUBMIT_ELEMENT;
	  @FindBy(how=How.XPATH,using="//div[@class='alert alert-success fade in']") WebElement VALIDATE_ACCOUNT_CREATION_ELEMENT;
	  
	  public void verifyAccountIfCreated(String message) {
		   Assert.assertEquals(VALIDATE_ACCOUNT_CREATION_ELEMENT.getText().trim(),message,"Account not created");
		}
	  
	  public void insertAccountTitle(String accountname) {
		  ACCOUNT_TITLE_ELEMENT.sendKeys(accountname);
		  
	  }
	  public void insertDescription(String desc) {
		  DESCRIPTION_ELEMENT.sendKeys(desc);
		  
	  } 
	  public void insertBalance(String bal) {
		 BALANCE_ELEMENT.sendKeys(bal);
		  
	  }
	  public void insertAccountNumber(String accountnumber) {
		  ACCOUNT_NUMBER_ELEMENT.sendKeys(accountnumber);
		  
	  }
	  public void insertContactPerson(String contactperson) {
		  CONTACT_PERSON_ELEMENT.sendKeys(contactperson);
		  
	  }
	  public void insertContactPhone(String contactphone) {
		  CONTACT_PHONE_ELEMENT.sendKeys(contactphone);
		  
	  }
	  public void insertUrl(String url) {
		 URL_ELEMENT.sendKeys(url);
		  
	  }
	  public void ClickOnSubmit() {
		  SUBMIT_ELEMENT.click();
		  
	  }
	  
}

