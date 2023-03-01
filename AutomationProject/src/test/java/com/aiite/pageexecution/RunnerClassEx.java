package com.aiite.pageexecution;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({AmazonLoginPageExecutionEx.class,HomePageExecutionEx.class})

public class RunnerClassEx {
@BeforeClass
public static void beforeClassMethod() {
	System.out.println("before class method");
}
@AfterClass
public static void afterClassMethod() {
	System.out.println("after class method");
}
}
