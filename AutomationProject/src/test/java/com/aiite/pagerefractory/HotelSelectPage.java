package com.aiite.pagerefractory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiite.baseclass.BaseClass;

public class HotelSelectPage extends BaseClass{
	public HotelSelectPage() {
		PageFactory.initElements(driver,this);
	}
@FindBy(id="radiobutton_0")
public WebElement selectHotel;
@FindBy(id="continue")
public WebElement continueBtn;
}
