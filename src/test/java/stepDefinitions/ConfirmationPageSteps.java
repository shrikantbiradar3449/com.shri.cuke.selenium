package stepDefinitions;

import org.junit.Assert;

import contextSharing.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enums.Context;
import pageObjects.ConfirmationPage;
 
public class ConfirmationPageSteps {
	TestContext testContext;
	ConfirmationPage confirmationPage;
	
	public ConfirmationPageSteps(TestContext context) {
		testContext = context;
		confirmationPage = testContext.getPageObjectManager().getConfirmationPage();
	}
	
	
	
	@Then("^verify the order details$")
	public void verify_the_order_details(){
		String productName = (String)testContext.scenarioContext.getContext(Context.PRODUCT_NAME);
		Assert.assertTrue(confirmationPage.getProductNames().stream().filter(x -> x.contains(productName)).findFirst().get().length()>0);		
	}
 
}