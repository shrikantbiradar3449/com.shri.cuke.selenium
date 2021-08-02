package runners;
import java.io.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;
 



@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/features/herokuAppLogin.feature",
	glue= {"stepDefinitions"},
	plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
	monochrome = true,
	tags = {"@First"}
//	,dryRun = true
//	,format = {“html:Folder_Name“}
//	,format = {“json:Folder_Name/cucumber.json“}
//	,format = { “junit:Folder_Name/cucumber.xml“}
	,strict=true
	)
 
 
public class JunitTestRunner {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	    Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", 	"Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.141.59");
	    Reporter.setSystemInfo("Maven", "3.5.2");
	    Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}
//	public static void writeExtentReport() {
//		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
//	}
}






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