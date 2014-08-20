package com.nlsinc.testnghomework.testcases;

import java.util.List;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

// NOTE: IInvokedMethodListener is an interface inside TestNG

public class CustomListener extends TestListenerAdapter implements IInvokedMethodListener{
	
	// NOTE: listeners are invoked after test case is over
	
	// NOTE: Code below overrides existing methods of TestListenerAdapter - we do this
	//		 --> we do this so we don't have to use an @AfterMethod after each test
	
	public void onTestFailure(ITestResult t){
		System.out.println(t.getName() + " has failed");
	}
	
	public void onTestSkipped(ITestResult t){
		System.out.println(t.getName() + " has been skipped");
	}
	
	public void onTestSuccess(ITestResult t){
		System.out.println(t.getName() + " has passed");
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}


}
