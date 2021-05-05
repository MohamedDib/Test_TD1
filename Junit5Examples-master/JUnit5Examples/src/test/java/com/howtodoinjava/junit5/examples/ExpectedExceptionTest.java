package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)

// Je veux sélectionné le package principale
public class ExpectedExceptionTest
{
	@Test
	void testExpectedException() {
		// 1- assert throw this exception : NumberFormatException

	}

	@Test
	void testExpectedExceptionWithSameType() {
		// 2- assert throw this exception : IllegalArgumentException
	}

}
