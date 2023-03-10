package com.aiite.pagerefractory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiite.baseclass.BaseClass;

public class AmazonLoginPageEx extends BaseClass{
	public AmazonLoginPageEx() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="nav-link-accountList-nav-line-1")
	public WebElement signIn;
	//public WebElement userName=driver.findElement(By.id("email"));
	@FindBy(id="ap_email")
	public WebElement userName;
	@FindBy(id="continue")
	public WebElement continueButton;
	//public WebElement userName=driver.findElement(By.id("pass"));
	@FindBy(id="ap_password")
	public WebElement password;
	
	@FindBy(id="signInSubmit")
	public WebElement logIn;
	

}
	


