package com.aiite.pageexecution;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.aiite.baseclass.BaseClass;
import com.aiite.pagerefractory.AmazonLoginPageEx;

public class AmazonLoginPageExecutionEx {
	@Before
	public void beforeMethod() throws IOException {
		BaseClass.browserLaunch();
		BaseClass.urlLaunch(BaseClass.getProperty("AmazonUrl"));
		System.out.println("beforeMethod");
	}
	@After
	public void afterMethod() {
		BaseClass.browserClose();
		System.out.println("afterMethod");
		}
	@Test
	public void loginWithValidCredential() throws IOException {
	AmazonLoginPageEx ip=new AmazonLoginPageEx();
	ip.signIn.click();
	ip.userName.sendKeys(BaseClass.getProperty("AmazonId"));
	ip.continueButton.click();
	ip.password.sendKeys(BaseClass.getProperty("AmazonPass"));
	ip.logIn.click();
	System.out.println("test");
	}
	@Ignore
	@Test
	public void loginWithInValidCredential() throws IOException {
	AmazonLoginPageEx ip=new AmazonLoginPageEx();
	ip.signIn.click();
	try{
		ip.userName.sendKeys(BaseClass.getProperty("AmazonInvalidId"));
		ip.continueButton.click();
	}
	catch(Exception e){
		System.out.println(e);
	}
	
	ip.password.sendKeys(BaseClass.getProperty("AmazonInvalidPass"));
	ip.logIn.click();
	System.out.println("test1");
	}

}
