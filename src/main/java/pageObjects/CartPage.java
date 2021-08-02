package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
 
public class CartPage {
	private WebDriver pageDriver;
	public CartPage(WebDriver driver) {
		this.pageDriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CSS, using = ".cart-button") 
	private WebElement btn_Cart;
	
	@FindBy(how = How.CSS, using = ".checkout-button.alt") 
	private WebElement btn_ContinueToCheckout;
	
	
	public void clickOn_Cart() {
		btn_Cart.click();
	}
	
	public void clickOn_ContinueToCheckout(){
		btn_ContinueToCheckout.click();
		try { Thread.sleep(5000);}
		catch (InterruptedException e) {}
	}

//###############  Another way to store elements #############################
	public void addCP(){
		pageDriver.findElement(ELEMENT.ADD_CP.findBy).click();
		pageDriver.findElement(ELEMENT.ADD_PARTNER.findBy).click();
	}
	private enum ELEMENT{
		ADD_CP(By.xpath("//span[text()='Add Controlling Party']")),
		ADD_PARTNER(By.id("addPartner"));

		private By findBy;

		ELEMENT(By locator){
			this.findBy = locator;
		}




	}
	//###############  Another way to store elements End #############################
}