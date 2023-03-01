package com.aiite.pageexecution;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aiite.baseclass.BaseClass;
import com.aiite.pagerefractory.HotelLoginPage;

public class HotelLoginPageExecution {
	@Before
	public  void browserLaunch() throws IOException {
		BaseClass.browserLaunch();
		BaseClass.urlLaunch(BaseClass.getExcel(1, 0));
	}
	@Test
	public  void withValidDetails() throws IOException, AWTException {
		HotelLoginPage lp=new HotelLoginPage();
		lp.userName.sendKeys(BaseClass.getExcel(2, 1));
		lp.passWord.sendKeys(BaseClass.getExcel(2, 2));
		BaseClass.takeScreenshotFull("loginPage1.png");
		lp.loginBtn.click();
		
	}
	@After
	public void browserClose() {
		BaseClass.browserClose();
	}

}
