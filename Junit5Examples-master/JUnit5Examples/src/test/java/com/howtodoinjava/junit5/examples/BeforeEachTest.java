package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class BeforeEachTest {

	@DisplayName("Add operation test")
	// Répéter 3 fois
	@RepeatedTest(3)
	@Test
	void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(2, Calculator.add(1, 1), "1 + 1 should equal 2");
	}

	// 1- method before each show message

	@BeforeEach
	@Test
	void showMsg(){
		System.out.println("Show this before each");
	}
}
