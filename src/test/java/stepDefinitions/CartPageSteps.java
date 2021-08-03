package stepDefinitions;

import transform.ExcelDataToDataTable;
import contextSharing.TestContext;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CartPage;

import java.util.List;
import java.util.Map;

public class CartPageSteps {
//	private DriverServices services;
//	private TestSettings testSettings;
	TestContext testContext;
	CartPage cartPage;
	
	public CartPageSteps(TestContext context) {
		testContext = context;
		cartPage = testContext.getPageObjectManager().getCartPage();
	}
	
	@When("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart(){
		cartPage.clickOn_Cart();
		cartPage.clickOn_ContinueToCheckout();	
	}

	@Then("^DataDriven_I provide the following information in the detail page from excel file \"([^\"]*)\"$")
	public void datadriven_i_provide_the_following_information_in_the_detail_page_from_excel_file(@Transform(ExcelDataToDataTable.class)DataTable table) throws Throwable {
		List<Map<String, String>> dataList = table.asMaps(String.class, String.class);
		Map<String, String> dataMap = dataList.get(0);
		System.out.println(dataMap.get("Version") + "   " + dataMap.get("Severity") + "   " + dataMap.get("Hardware"));
		//, dataMap.get("Version"), dataMap.get("Severity"), dataMap.get("Hardware"));
		//testSettings.detailPage.provideOtherDetails(dataMap.get("Operating"), dataMap.get("Summary"), dataMap.get("Description"));
	}


}

