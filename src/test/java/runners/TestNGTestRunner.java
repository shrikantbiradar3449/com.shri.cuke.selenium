package runners;

import cucumber.api.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = "src/test/resources/features/herokuAppLogin2021.feature",
		glue = {"stepDefinitions"},
		tags = {"@new"},
//		tags = {"~@Ignore"},
//		format = {
//				"pretty",
//				"html:target/cucumber-reports/cucumber-pretty",
//				"json:target/cucumber-reports/CucumberTestReport.json",
//				"rerun:target/cucumber-reports/rerun.txt"
//		},
//		plugin = "json:target/cucumber-reports/CucumberTestReport.json")
//		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
)


public class TestNGTestRunner  {

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();
	}
}
 
 


//	public static void writeExtentReport() {
//		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
//	}







//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = "src/test/resources/functionalTests",
//		glue= {"stepDefinitions"},
//				plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
//						"junit:target/cucumber-reports/Cucumber.xml",
//						"html:target/cucumber-reports"},
//		//		plugin = { "usage" },
//		monochrome = true
//		)
// 
//public class TestRunner {
// 
//}