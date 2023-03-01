package com.aiite.pageexecution;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aiite.baseclass.BaseClass;
import com.aiite.pagerefractory.HotelBookingPage;

public class HotelBookingPageExecution {
	@Before
	public void beforeMethod() throws IOException {
		BaseClass.browserLaunch();
		BaseClass.urlLaunch(BaseClass.getExcel(5, 0));
	}
	@Test
	public void withValidDetails() throws IOException, AWTException, InterruptedException {
		HotelSelectPageExecution hsp=new HotelSelectPageExecution();
		hsp.withValidDetails();
		HotelBookingPage hbp=new HotelBookingPage();
		hbp.firstName.sendKeys(BaseClass.getExcel(1,11));
		hbp.lastName.sendKeys(BaseClass.getExcel(1,12));
		hbp.billingAddress.sendKeys(BaseClass.getExcel(1,13));
		hbp.creditCardNo.sendKeys(BaseClass.getExcel(1,14));
		hbp.creditCardType.sendKeys(BaseClass.getExcel(1,15));
		hbp.creditCardExpiryMonth.sendKeys(BaseClass.getExcel(1,16));
		hbp.creditCardExpiryYear.sendKeys(BaseClass.getExcel(1,17));
		hbp.creditCardCvvNo.sendKeys(BaseClass.getExcel(1,18));
		hbp.bookNowBtn.click();
		Thread.sleep(6000);
		BaseClass.takeScreenshotFull("bookingPage5");
	
//@After
//public void afterMethod() {
//	BaseClassEx.browserClose();
//}
}
}