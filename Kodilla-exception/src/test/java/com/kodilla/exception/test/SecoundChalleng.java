package com.kodilla.exception.test;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class probablyIWillThrowExceptionTestSuite {
    @Test
    void testProbablyIWillThrowExceptionTestSuite() {
        // given
        SecoundChallenge secondChallenge = new SecoundChallenge();
        // when & then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 1.1));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0, 1.5));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.4, 1.3));
    }
}