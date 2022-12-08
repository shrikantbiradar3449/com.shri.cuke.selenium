package stepDefinitions;


//Created separate step definition classes for different pages

//import org.openqa.selenium.WebDriver;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//import managers.PageObjectManager;
//import managers.WebDriverManager;
//import pageObjects.CartPage;
//import pageObjects.CheckoutPage;
//import pageObjects.HomePage;
//import pageObjects.ProductListingPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

    @Given("^I do something with \"([^\"]*)\" from example table$")
    public void iDoSomethingWithNames(String name) {
        System.out.print(name);
    }
//	WebDriver driver;
//	HomePage homePage;
//	ProductListingPage productListingPage;
//	CartPage cartPage;
//	CheckoutPage checkoutPage;
//	PageObjectManager pageObjectManager;	
//	WebDriverManager webDriverManager;
//	
//	
//	@Given("^user is on Home Page$")
//	public void user_is_on_Home_Page(){
//		webDriverManager = new WebDriverManager();
//		driver = webDriverManager.getDriver();
//		pageObjectManager = new PageObjectManager(driver);
//		homePage = pageObjectManager.getHomePage();
//		homePage.navigateTo_HomePage();	
//	}
// 
//	@When("^he search for \"([^\"]*)\"$")
//	public void he_search_for(String product)  {
//		homePage.perform_Search(product);
//	}
// 
//	@When("^choose to buy the first item$")
//	public void choose_to_buy_the_first_item() {
//		productListingPage = pageObjectManager.getProductListingPage();
//		productListingPage.select_Product(0);
//		productListingPage.clickOn_AddToCart();		
//	}
// 
//	@When("^moves to checkout from mini cart$")
//	public void moves_to_checkout_from_mini_cart(){
//		cartPage = pageObjectManager.getCartPage();
//		cartPage.clickOn_Cart();
//		cartPage.clickOn_ContinueToCheckout();	
//	}
//	
//	@When("^enter personal details on checkout page$")
//	public void enter_personal_details_on_checkout_page(){
//		checkoutPage = pageObjectManager.getCheckoutPage();
//		checkoutPage.fill_PersonalDetails();	
//	}
//	
//	@When("^select same delivery address$")
//	public void select_same_delivery_address(){
//		checkoutPage.check_ShipToDifferentAddress(false);
//	}
//	
//	@When("^select payment method as \"([^\"]*)\" payment$")
//	public void select_payment_method_as_payment(String arg1){
//		checkoutPage.select_PaymentMethod("CheckPayment");
//	}
// 
//	@When("^place the order$")
//	public void place_the_order() {
//		checkoutPage.check_TermsAndCondition(true);
//		checkoutPage.clickOn_PlaceOrder();		
//		webDriverManager.closeDriver();
//	}	
}



















































//Before WebDriverManager

// 
//public class Steps {
//	WebDriver driver;
//	HomePage homePage;
//	ProductListingPage productListingPage;
//	CartPage cartPage;
//	CheckoutPage checkoutPage;
//	PageObjectManager pageObjectManager;	
// 
//	@Given("^user is on Home Page$")
//	public void user_is_on_Home_Page(){
//		System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
//		pageObjectManager = new PageObjectManager(driver);
//		homePage = pageObjectManager.getHomePage();
//		homePage.navigateTo_HomePage();	
//	}
// 
//	@When("^he search for \"([^\"]*)\"$")
//	public void he_search_for(String product)  {
//		homePage.perform_Search(product);
//	}
// 
//	@When("^choose to buy the first item$")
//	public void choose_to_buy_the_first_item() {
//		productListingPage = pageObjectManager.getProductListingPage();
//		productListingPage.select_Product(0);
//		productListingPage.clickOn_AddToCart();		
//	}
// 
//	@When("^moves to checkout from mini cart$")
//	public void moves_to_checkout_from_mini_cart(){
//		cartPage = pageObjectManager.getCartPage();
//		cartPage.clickOn_Cart();
//		cartPage.clickOn_ContinueToCheckout();	
//	}
// 
//	@When("^enter personal details on checkout page$")
//	public void enter_personal_details_on_checkout_page(){
//		checkoutPage = pageObjectManager.getCheckoutPage();
//		checkoutPage.fill_PersonalDetails();	
//	}
// 
//	@When("^select same delivery address$")
//	public void select_same_delivery_address(){
//		checkoutPage.check_ShipToDifferentAddress(false);
//	}
// 
//	@When("^select payment method as \"([^\"]*)\" payment$")
//	public void select_payment_method_as_payment(String arg1){
//		checkoutPage.select_PaymentMethod("CheckPayment");
//	}
// 
//	@When("^place the order$")
//	public void place_the_order() {
//		checkoutPage.check_TermsAndCondition(true);
//		checkoutPage.clickOn_PlaceOrder();		
//		driver.quit();
//	}	
//}


























//Before creating data FileReaderManager
//public class Steps {
//	WebDriver driver;
//	HomePage homePage;
//	ProductListingPage productListingPage;
//	CartPage cartPage;
//	CheckoutPage checkoutPage;
//	PageObjectManager pageObjectManager;	
//	ConfigFileReader configFileReader;
//	
//	@Given("^user is on Home Page$")
//	public void user_is_on_Home_Page(){
//		configFileReader= new ConfigFileReader();
//		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
//		pageObjectManager = new PageObjectManager(driver);
//		homePage = pageObjectManager.getHomePage();
//		homePage.navigateTo_HomePage();	
//	}
// 
//	@When("^he search for \"([^\"]*)\"$")
//	public void he_search_for(String product)  {
//		homePage.perform_Search(product);
//	}
// 
//	@When("^choose to buy the first item$")
//	public void choose_to_buy_the_first_item() {
//		productListingPage = pageObjectManager.getProductListingPage();
//		productListingPage.select_Product(0);
//		productListingPage.clickOn_AddToCart();		
//	}
// 
//	@When("^moves to checkout from mini cart$")
//	public void moves_to_checkout_from_mini_cart(){
//		cartPage = pageObjectManager.getCartPage();
//		cartPage.clickOn_Cart();
//		cartPage.clickOn_ContinueToCheckout();	
//	}
//	
//	@When("^enter personal details on checkout page$")
//	public void enter_personal_details_on_checkout_page(){
//		checkoutPage = pageObjectManager.getCheckoutPage();
//		checkoutPage.fill_PersonalDetails();	
//	}
//	
//	@When("^select same delivery address$")
//	public void select_same_delivery_address(){
//		checkoutPage.check_ShipToDifferentAddress(false);
//	}
//	
//	@When("^select payment method as \"([^\"]*)\" payment$")
//	public void select_payment_method_as_payment(String arg1){
//		checkoutPage.select_PaymentMethod("CheckPayment");
//	}
// 
//	@When("^place the order$")
//	public void place_the_order() {
//		checkoutPage.check_TermsAndCondition(true);
//		checkoutPage.clickOn_PlaceOrder();		
//		driver.quit();
//	}	
//}






//Before creating data ConfigFileREader

//
//public class Steps {
//	WebDriver driver;
//	HomePage homePage;
//	ProductListingPage productListingPage;
//	CartPage cartPage;
//	CheckoutPage checkoutPage;
//	PageObjectManager pageObjectManager;
//	
//	@Given("^user is on Home Page$")
//	public void user_is_on_Home_Page(){
//		System.setProperty("webdriver.chrome.driver","F:\\BDD\\lib\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		pageObjectManager = new PageObjectManager(driver);
//		homePage = pageObjectManager.getHomePage();
//		homePage.navigateTo_HomePage();	
//	}
// 
//	@When("^he search for \"([^\"]*)\"$")
//	public void he_search_for(String product)  {
//		homePage.perform_Search(product);
//	}
// 
//	@When("^choose to buy the first item$")
//	public void choose_to_buy_the_first_item() {
//		productListingPage = pageObjectManager.getProductListingPage();
//		productListingPage.select_Product(0);
//		productListingPage.clickOn_AddToCart();		
//	}
// 
//	@When("^moves to checkout from mini cart$")
//	public void moves_to_checkout_from_mini_cart(){
//		cartPage = pageObjectManager.getCartPage();
//		cartPage.clickOn_Cart();
//		cartPage.clickOn_ContinueToCheckout();	
//	}
//	
//	@When("^enter personal details on checkout page$")
//	public void enter_personal_details_on_checkout_page() throws InterruptedException {
//		checkoutPage = pageObjectManager.getCheckoutPage();
//		checkoutPage.fill_PersonalDetails();	
//	}
//	
//	@When("^select same delivery address$")
//	public void select_same_delivery_address() throws InterruptedException{
//		checkoutPage.check_ShipToDifferentAddress(false);
//	}
//	
//	@When("^select payment method as \"([^\"]*)\" payment$")
//	public void select_payment_method_as_payment(String arg1){
//		checkoutPage.select_PaymentMethod("CheckPayment");
//	}
// 
//	@When("^place the order$")
//	public void place_the_order() throws InterruptedException {
//		checkoutPage.check_TermsAndCondition(true);
//		checkoutPage.clickOn_PlaceOrder();
//		
//		driver.quit();
//	}	
//}







//Before creating Page object manager class
//public class Steps {
//	WebDriver driver;
//	HomePage home;
//	ProductListingPage productListingPage;
//	CartPage cartPage;
//	CheckoutPage checkoutPage;
//	
//	@Given("^user is on Home Page$")
//	public void user_is_on_Home_Page(){
//		System.setProperty("webdriver.chrome.driver","F:\\BDD\\lib\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://www.shop.demoqa.com");
//	}
// 
//	@When("^he search for \"([^\"]*)\"$")
//	public void he_search_for(String product)  {
//		home = new HomePage(driver);
//		home.perform_Search(product);
//	}
// 
//	@When("^choose to buy the first item$")
//	public void choose_to_buy_the_first_item() {
//		productListingPage = new ProductListingPage(driver);
//		productListingPage.select_Product(0);
//		productListingPage.clickOn_AddToCart();		
//	}
// 
//	@When("^moves to checkout from mini cart$")
//	public void moves_to_checkout_from_mini_cart(){
//		cartPage = new CartPage(driver);
//		cartPage.clickOn_Cart();
//		cartPage.clickOn_ContinueToCheckout();	
//	}
//	
//	@When("^enter personal details on checkout page$")
//	public void enter_personal_details_on_checkout_page() throws InterruptedException {
//		checkoutPage = new CheckoutPage(driver);
//		checkoutPage.fill_PersonalDetails();	
//	}
//	
//	@When("^select same delivery address$")
//	public void select_same_delivery_address() throws InterruptedException{
//		checkoutPage.check_ShipToDifferentAddress(false);
//	}
//	
//	@When("^select payment method as \"([^\"]*)\" payment$")
//	public void select_payment_method_as_payment(String arg1){
//		checkoutPage.select_PaymentMethod("CheckPayment");
//	}
// 
//	@When("^place the order$")
//	public void place_the_order() throws InterruptedException {
//		checkoutPage.check_TermsAndCondition(true);
//		checkoutPage.clickOn_PlaceOrder();
//		
//		driver.quit();
//	}	
//}
//

























//Before Creating Pages
//
//public class Steps {
//	
//	WebDriver driver;
//	@Given("^user is on Home Page$")
//	public void user_is_on_Home_Page(){
//		System.setProperty("webdriver.chrome.driver","F:\\BDD\\lib\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://www.shop.demoqa.com");
//		System.out.println("user is on Home Page");
//	}
//
//@When("^he search for \"([^\"]*)\"$")
//public void he_search_for(String arg1) {
//	driver.navigate().to("http://shop.demoqa.com/?s=" + arg1 + "&post_type=product");
//	System.out.println("he search for dress");
//}
//
//@When("^choose to buy the first item$")
//public void choose_to_buy_the_first_item() {
//	List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
//	items.get(0).click();
//
//	WebElement addToCart = driver.findElement(By.cssSelector("button.single_add_to_cart_button"));
//	addToCart.click();	
//	System.out.println("choose to buy the first item");
//}
//
//@When("^moves to checkout from mini cart$")
//public void moves_to_checkout_from_mini_cart() {
//	WebElement cart = driver.findElement(By.cssSelector(".cart-button"));
//	cart.click();
//
//	WebElement continueToCheckout = driver.findElement(By.cssSelector(".checkout-button.alt"));
//	continueToCheckout.click();	
//	System.out.println("moves to checkout from mini cart");
//}
//
//@When("^enter personal details on checkout page$")
//public void enter_personal_details_on_checkout_page() throws InterruptedException {
//	Thread.sleep(5000);
//	WebElement firstName = driver.findElement(By.cssSelector("#billing_first_name"));
//	firstName.sendKeys("Lakshay");
//
//	WebElement lastName = driver.findElement(By.cssSelector("#billing_last_name"));
//	lastName.sendKeys("Sharma");
//
//	WebElement emailAddress = driver.findElement(By.cssSelector("#billing_email"));
//	emailAddress.sendKeys("test@gmail.com");
//
//	WebElement phone = driver.findElement(By.cssSelector("#billing_phone"));
//	phone.sendKeys("07438862327");
//
//	WebElement countryDropDown = driver.findElement(By.cssSelector("#billing_country_field .select2-arrow"));
//	countryDropDown.click();
//	Thread.sleep(2000);
//
//	List<WebElement> countryList = driver.findElements(By.cssSelector("#select2-drop ul li"));
//	for(WebElement country : countryList){
//		if(country.getText().equals("India")) {
//			country.click();	
//			Thread.sleep(3000);
//			break;
//		}		
//	}
//
//	WebElement city = driver.findElement(By.cssSelector("#billing_city"));
//	city.sendKeys("Delhi");
//
//	WebElement address = driver.findElement(By.cssSelector("#billing_address_1"));
//	address.sendKeys("Shalimar Bagh");
//
//	WebElement postcode = driver.findElement(By.cssSelector("#billing_postcode"));
//	postcode.sendKeys("110088");
//
//	WebElement countyDropDown = driver.findElement(By.cssSelector("#billing_state_field .select2-arrow"));
//	countyDropDown.click();
//	Thread.sleep(2000);
//	
//	List<WebElement> countyList = driver.findElements(By.cssSelector("#select2-drop ul li"));
//	for(WebElement county : countyList){
//		if(county.getText().equals("Delhi")) {
//			county.click();	
//			Thread.sleep(3000);
//			break;
//		}		
//	}
//	
//	System.out.println("enter personal details on checkout page");
//    
//}
//
//@When("^select same delivery address$")
//public void select_same_delivery_address() throws InterruptedException {
//	WebElement shipToDifferetAddress = driver.findElement(By.cssSelector("#ship-to-different-address-checkbox"));
//	shipToDifferetAddress.click();
//	Thread.sleep(3000);
//	System.out.println("select same delivery address");
//    
//}
//
//@When("^select payment method as \"([^\"]*)\" payment$")
//public void select_payment_method_as_payment(String arg1) {
//	List<WebElement> paymentMethod = driver.findElements(By.cssSelector("ul.wc_payment_methods li"));
//	paymentMethod.get(0).click();
//	System.out.println("select payment method");
//}
//
//@When("^place the order$")
//public void place_the_order() {
//	WebElement acceptTC = driver.findElement(By.cssSelector("#terms.input-checkbox"));
//	acceptTC.click();
//
//	WebElement placeOrder = driver.findElement(By.cssSelector("#place_order"));
//	placeOrder.submit();
//	System.out.println("After Placing order");
//  
//}
//
//}