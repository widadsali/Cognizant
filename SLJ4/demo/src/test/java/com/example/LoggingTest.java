package com.example;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingTest {
    
    // Create the logger for the test class
    private static final Logger logger = LoggerFactory.getLogger(LoggingTest.class);

    @Test
    public void testMyLogs() {
        // These will print to the console when the test runs!
        logger.error("This is an error message from JUnit!");
        logger.warn("This is a warning message from JUnit!");
    }
}