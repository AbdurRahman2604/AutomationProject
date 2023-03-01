package com.aiite.pageexecution;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aiite.baseclass.BaseClass;
import com.aiite.pagerefractory.HomePageEx;

public class HomePageExecutionEx {
	
	//public static void main(String[] args) throws IOException {
	@Before
	public void beforeMethod() throws IOException {
		BaseClass.browserLaunch();
		BaseClass.urlLaunch(BaseClass.getProperty("HomeUrl"));
		System.out.println("beforeMethod");
	}
		
		@Test
		public void loginWithValidCredential() throws IOException {
		HomePageEx hp=new HomePageEx();
		hp.userName.sendKeys(BaseClass.getProperty("userId"));
		hp.password.sendKeys(BaseClass.getProperty("pass"));
		hp.signIn.click();
		}
		@After
		public void afterMethod() {
			BaseClass.browserClose();
			System.out.println("afterMethod");
			}

}
