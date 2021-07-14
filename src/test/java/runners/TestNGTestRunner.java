package runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import managers.FileReaderManager;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;


import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
//features = "src/test/resources/functionalTests/herokuAppLogin.feature",
@CucumberOptions(
		features = "classpath:features",
		glue = {"stepDefinitions"},
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		tags = {"@2021"}
)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

//	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}


	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.7.0");
		Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
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