package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;

public class AppTest {

    App app;
    int[] expected;
    int[] results;
    @BeforeEach
    public void setUp() {
        app = new App();
    }

//    @Disabled
    @Test
    public void testOneRow() {
        expected = new int[]{1};
        results = app.createPalindromicTriangle(1);
        assertArrayEquals(expected, results);
    }

//    @Disabled
    @Test
    public void testTwoRows() {
        expected = new int[]{1, 121};
        results = app.createPalindromicTriangle(2);
        assertArrayEquals(expected, results);
    }

//    @Disabled
    @Test
    public void testThreeRows() {
        expected = new int[]{1, 121, 12321};
        results = app.createPalindromicTriangle(3);
        assertArrayEquals(expected, results);
    }

//    @Disabled
    @Test
    public void testFourRows() {
        expected = new int[]{1, 121, 12321, 1234321};
        results = app.createPalindromicTriangle(4);
        assertArrayEquals(expected, results);
    }
}
