package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import enums.Context;
import transform.ExcelDataToDataTable;
import contextSharing.TestContext;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CartPage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CartPageSteps {
//	private DriverServices services;
//	private TestSettings testSettings;
	TestContext testContext;
	CartPage cartPage;
	Scenario scenario;
	
	public CartPageSteps(TestContext context) {
		testContext = context;
		cartPage = testContext.getPageObjectManager().getCartPage();
//		scenario =
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

	}


	@Given("^Select shipnode as \"([^\"]*)\" from results and click on Submit$")
	public void select_enterprise_code_is_and_plant_is(String arg1) {
		System.out.println(testContext.getScenarioContext().getContext(Context.SCENARIO_NAME));
		String currentScenario = testContext.getScenarioContext().getContext(Context.SCENARIO_NAME).toString();
		currentScenario = currentScenario.replace("_"," ");
		List<Map<String, String>> dataList = new ExcelDataToDataTable().transform("testDataSheetPath").asMaps(String.class, String.class);
		Map<String, String> dataMap = new HashMap<>();

		for (Map<String, String> m:dataList) {
			if(m.containsValue(currentScenario)){
				dataMap = m;
				break;
			}
		}

		System.out.println(dataMap.get("Version") + "   " + dataMap.get(arg1) + "   " + dataMap.get("Hardware"));

	}


}

