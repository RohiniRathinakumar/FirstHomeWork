package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage extends BasePage {
	WebDriver driver;
	 
	public  DashboardPage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_HEADER_ELEMENT;
	
	
	  @FindBy(how=How.XPATH,using="//span[text()='Bank & Cash']") WebElement BANK_AND_CASH_ELEMENT;
	  
	  @FindBy(how=How.XPATH,using="//a[text()='New Account']") WebElement NEW_ACCOUNT_ELEMENT;
	  
	 
	 
	
	public void verifyDashboardPage(String message) {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(),message,"Dashboard is not found");
	}
	
	  public void clickOnBankAndCash()  {
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  BANK_AND_CASH_ELEMENT.click();
	  } 
	  public void clickOnNewAccount() { 
	  NEW_ACCOUNT_ELEMENT.click(); 
	  }
	 
	
}

