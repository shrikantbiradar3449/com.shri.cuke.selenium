package stepDefinitions;
import org.junit.Assert;

import contextSharing.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Context;
import pageObjects.HerokuLogInPage;


public class HerokuLogInSteps {
	
	TestContext testContext; 
	HerokuLogInPage herokuLogInPage;
	
	
	public HerokuLogInSteps(TestContext Context){
		
		testContext = Context;
		herokuLogInPage = testContext.getPageObjectManager().getHirakuPage();
		
	}
	
	
	@Given("^I have navigated to heroku login page$")
	public void i_have_navigated_to_heroku_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		herokuLogInPage.navigated_to_heroku();
	}

	@When("^I enter username for heroku$")
	public void i_enter_username_for_heroku() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		herokuLogInPage.enterUserName();
	}

	@When("^I enter password for heroku$")
	public void i_enter_password_for_heroku() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		herokuLogInPage.enterPasswd();
	}

	@When("^I submit the form$")
	public void i_submit_the_form() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		herokuLogInPage.submitform();
	}

	@Then("^I should see heroku homepage$")
	public void i_should_see_heroku_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		herokuLogInPage.logIntoHerokuApp();
	}


}//EOC
