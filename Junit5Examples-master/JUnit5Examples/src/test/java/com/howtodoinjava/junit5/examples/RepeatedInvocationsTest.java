package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class RepeatedInvocationsTest {
	
// 1- create double method to show message before all and before each

	// 2- test title
	// 3- repeat it 5 times
	void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo)
	{
		System.out.println("Running addNumber test -> " + repetitionInfo.getCurrentRepetition());
		// 4- create test with assertEquals
	}
	

	// 5- double clean method after all and after each
}