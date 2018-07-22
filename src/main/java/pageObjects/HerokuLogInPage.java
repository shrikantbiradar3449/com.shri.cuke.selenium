package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
import selenium.Wait;

public class HerokuLogInPage {
	WebDriver driver;
	public HerokuLogInPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	By linkFormAuth = By.linkText("Form Authentication");
	
	@FindBy(how = How.ID, using = "username") 
	private WebElement input_userName;
	
	@FindBy(how = How.ID, using = "password") 
	private WebElement input_passwd;
	
	@FindBy(how = How.CSS, using = ".radius[type=\"submit\"]") 
	private WebElement btn_submit;
	
	@FindBy(how=How.LINK_TEXT,using="Form Authentication") 
	private WebElement link_FormAuth;
	
	@FindBy(how=How.CSS, using = "i.icon-lock")
	private WebElement text_SecureArea;
	
	
	public void logIntoHerokuApp(){
		System.out.println("Text Displyed " + text_SecureArea.getText());
	}
	
	public void navigated_to_heroku(){
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		Wait.untilJqueryIsDone(driver);
		Wait.untilElementisVisible(driver, linkFormAuth);
		link_FormAuth.click();
	}
	
	public void enterUserName() throws InterruptedException{
		
		input_userName.sendKeys("tomsmith");
		Thread.sleep(1000);
	}
	
	
	public void enterPasswd() throws InterruptedException{
		
		input_passwd.sendKeys("SuperSecretPassword!");
		Thread.sleep(1000);
	}
	
	public void submitform() throws InterruptedException{
		btn_submit.click();
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}//EOC
