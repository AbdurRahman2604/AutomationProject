package com.aiite.pagerefractory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiite.baseclass.BaseClass;

public class HotelLoginPage extends BaseClass {
	public HotelLoginPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@id='username']")
	public WebElement userName;
	@FindBy(xpath="//input[@id='password']")
	public WebElement passWord;
	@FindBy(xpath="//input[@id='login']")
	public WebElement loginBtn;
}
