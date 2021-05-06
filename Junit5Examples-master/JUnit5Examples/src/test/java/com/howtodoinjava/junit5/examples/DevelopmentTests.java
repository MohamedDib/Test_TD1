package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.Nested;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
// 1- defined tested package
@Nested
// 2- je veux inclure le tag "development"
@IncludeTags("DEV")
public class DevelopmentTests
{
}
