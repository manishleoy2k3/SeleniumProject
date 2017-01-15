package com.naukri.ReportClass;

import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerClass extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult tr) {
		log("Test '" + tr.getName() + "' Started....");
	}

	@Override
	public void onTestSuccess(ITestResult tr) {

		log("Test '" + tr.getName() + "' PASSED");

		// This will print the class name in which the method is present
		log(tr.getTestClass());

		// This will print the priority of the method.
		// If the priority is not defined it will print the default priority as
		// 'o'
		log("Priority of this method is " + tr.getMethod().getPriority());

		System.out.println(".....");
	}

	@Override
	public void onTestFailure(ITestResult tr) {

		log("Test '" + tr.getName() + "' FAILED");
		log("Priority of this method is " + tr.getMethod().getPriority());
		System.out.println(".....");
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		log("Test '" + tr.getName() + "' SKIPPED");
		System.out.println(".....");
	}

	public void log(String methodName) {
		System.out.println(methodName);
	}
	public void logtestmessage(String teststep){
		System.out.println(teststep);
	}

	public void log(IClass testClass) {
		System.out.println(testClass);
	}
}
