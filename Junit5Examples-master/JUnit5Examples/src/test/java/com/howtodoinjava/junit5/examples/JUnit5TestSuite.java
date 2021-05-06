package com.howtodoinjava.junit5.examples;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
// 1- selectionné le package principale
@SelectPackages("com.howtodoinjava.junit5.examples")
// 2- inclure le package C
@IncludePackages("com.howtodoinjava.junit5.examples.packageC")
// 3- exclure prod
@ExcludeTags("DEV")
public class JUnit5TestSuite {

}
