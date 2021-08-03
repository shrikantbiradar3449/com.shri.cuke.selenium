package stepDefinitions;

import java.io.File;
import java.io.IOException;

import enums.Context;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import contextSharing.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import cucumber.api.java.
 
public class Hooks {	
	TestContext testContext;	
	public Hooks(TestContext context) {
		testContext = context;
	}
	Scenario scenario;

	@Before("@First")
	public void beforeFirst(){
		System.out.println("This will run only before the First Scenario");
		Reporter.assignAuthor("ShriBs - Shrikanr Biradar");
//	    Reporter.addStepLog("Step Log message goes here");
//	    Reporter.addScenarioLog("Scenario Log message goes here");
	}
	@Before
	public void beforeScenario(Scenario scenario) {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		testContext.scenarioContext.setContext(Context.SCENARIO_NAME, screenshotName);
		this.scenario = scenario;
	}
	
	@After(order = 1)
	public void afterScenario(Scenario scenario) {
//		scenario.
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				//This takes a screenshot from the driver at save it to the specified location
				File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
				String fullPath = System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png";
				System.out.println("Path for screenshot " + fullPath);
				
				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File(fullPath);
				
				//Copy taken screenshot from source location to destination location
				Files.copy(sourcePath, destinationPath);   
 
				//This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			} 
		}
	}
	
	@After(order = 0)
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
	}
}
















//public class Hooks {
// 
//	TestContext testContext;
// 
//	public Hooks(TestContext context) {
//		testContext = context;
//	}
// 
//	@Before
//	public void BeforeSteps() {
//		System.out.println("I am in Before Steps Hook");
//		/*What all you can perform here
//			Starting a webdriver
//			Setting up DB connections
//			Setting up test data
//			Setting up browser cookies
//			Navigating to certain page
//			or anything before the test
//		*/
//	}
// 
//	@After
//	public void AfterSteps() {
//		System.out.println("I am in After Steps Hook");
//		testContext.getWebDriverManager().closeDriver();
//	}
// 
//}