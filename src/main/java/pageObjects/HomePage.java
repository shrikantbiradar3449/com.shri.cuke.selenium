package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
 
import managers.FileReaderManager;
 
public class HomePage {
	WebDriver driver;
 
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 
	public void perform_Search(String search) {
		driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl() + "/?s=" + search + "&post_type=product");
	}
 
	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
 
}
 
































//Before creating data FileReaderManager

//public class HomePage {
//	WebDriver driver;
//	ConfigFileReader configFileReader;
//	
//	public HomePage(WebDriver driver){
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//		configFileReader= new ConfigFileReader();
//	}
//	
//	public void perform_Search(String search) {
//		driver.navigate().to(configFileReader.getApplicationUrl() + "/?s=" + search + "&post_type=product");
//	}
//	
//	public void navigateTo_HomePage() {
//		driver.get(configFileReader.getApplicationUrl());
//	}
// 
//}




//Before creating data ConfigFileREader

//public class HomePage {
//	WebDriver driver;
//	
//	public HomePage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
//	
//	public void perform_Search(String search) {
//		driver.navigate().to("http://shop.demoqa.com/?s=" + search + "&post_type=product");
//	}
//	
//	public void navigateTo_HomePage() {
//		driver.get("http://www.shop.demoqa.com");
//	}
//
//}