package com.aiite.pagerefractory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiite.baseclass.BaseClass;

public class HomePageEx  extends BaseClass{
	public HomePageEx() {
		PageFactory.initElements(driver,this);
	}
	//public WebElement userName=driver.findElement(By.id("email"));
	@FindBy(id="email")
	public WebElement userName;
	//public WebElement userName=driver.findElement(By.id("pass"));
	@FindBy(id="pass")
	public WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	public WebElement signIn;
	

}
