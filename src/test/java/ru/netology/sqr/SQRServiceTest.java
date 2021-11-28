package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'from 200 to 300', 200, 300, 3",
            "'from 100 to 9801', 100, 9801, 90",
            "'from 99 to 100', 99, 100, 1",
            "'from 100 to 101', 100, 101, 1",
            "'from 9800 to 9802', 9800, 9802, 1",
            "'from 0 to 0', 0, 0, 0"})
    void calculateNumberOfSquare (String testName, int start, int end, int expected) {
        SQRService service = new SQRService();
        int count = service.numberOfSquares (start, end);
        assertEquals(expected, count);
        System.out.println(testName);
    }
}