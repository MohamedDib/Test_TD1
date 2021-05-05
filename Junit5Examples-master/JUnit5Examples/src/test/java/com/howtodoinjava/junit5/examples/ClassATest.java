package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

// 1- we wanna test development
@Tag("DEV")
public class ClassATest
{
	@Test
	@Tag("DEV")
	// tagger le test (tag de votre choix)
	void testCaseA(TestInfo testInfo) {
	}
}
