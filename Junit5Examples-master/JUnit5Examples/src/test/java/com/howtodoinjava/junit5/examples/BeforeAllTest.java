package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class BeforeAllTest {


	// 3- nommer le test
	@DisplayName("Before all test")

	// 1- Répéter 3 fois
	@RepeatedTest(3)
	void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
	}
	
	// 2- method before all show message
	@BeforeAll
	private static String message () {
		return "Show this before tests ";
	}

}
