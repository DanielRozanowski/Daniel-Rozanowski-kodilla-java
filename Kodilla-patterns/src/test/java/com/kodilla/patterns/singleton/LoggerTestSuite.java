package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void openLogger() {
        logger = Logger.INSTANCE;
        logger.open(logger.name());
    }

    @AfterAll
    public static void closeLogger() {
        logger.close();
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String lastLog = logger.getLastLog();
        System.out.println("Last log: " + lastLog);
        //Then
        assertEquals("19.04.2021; 22.15 Exercise done.", lastLog);
        assertNotEquals("19.04.2021; 21.09 Beginning work with this exercise.", lastLog);
    }
}
