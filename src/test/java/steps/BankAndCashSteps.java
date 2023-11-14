package steps;

import java.util.List;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Accounts;
import pages.DashboardPage;

import pages.LoginPage;
import pages.TestBase;

public class BankAndCashSteps extends TestBase {
	LoginPage loginPage;
	DashboardPage dashboardPage;
	Accounts accounts;

	@Before
	public void beforReRun() {
		init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		accounts = PageFactory.initElements(driver, Accounts.class);
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String uname, String pword) {
		loginPage.insertLoginInfo(uname, pword);
		// loginPage.insertPassword(pword);
	}

	@When("User clicks on signin button")
	public void user_clicks_on_signin_button() {
		loginPage.clickSignInButton();

	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		dashboardPage.verifyDashboardPage("Dashboard");
	}

	@Then("User clicks on BankAndCash")
	public void user_clicks_on_BankAndCash() {
		dashboardPage.clickOnBankAndCash();

	}

	@Then("User clicks on NewAccount")
	public void user_clicks_on_NewDeposoit() {
		dashboardPage.clickOnNewAccount();
	}

	@Then("User enters information on add new accounts page.")
	public void user_enters_in_the_field_in_accounts_page(List<String> data) {

		accounts.insertAccountTitle(data.get(0) + generateRandomNumber(999));
		accounts.insertDescription(data.get(1));
		accounts.insertBalance(data.get(2));
		accounts.insertAccountNumber(data.get(3));
		accounts.insertContactPerson(data.get(4));
		accounts.insertContactPhone(data.get(5));
		// accounts.insertUrl(data.get(6));

	}

	@Then("User clicks on submit")
	public void user_clicks_on() {
		accounts.ClickOnSubmit();
	}

	@Then("User should be able to validate Account Created Successfully")
	public void user_should_be_able_to_validate_account_created_successfully()  {
		accounts.verifyAccountIfCreated("Account Created Successfully");
	}

	@After
	public void closeBrowser() {
		tearDown();
	}
}
