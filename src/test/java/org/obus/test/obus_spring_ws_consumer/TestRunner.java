package org.obus.test.obus_spring_ws_consumer;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[]args) {
		Result result = JUnitCore.runClasses(AppTest.class);
		
		for(Failure failure : result.getFailures()) {
			System.out.print(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
}
