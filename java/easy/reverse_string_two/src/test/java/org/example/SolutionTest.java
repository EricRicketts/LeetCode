package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution app;
    String expected;
    String inputStr;
    String results;
    int k;
    @BeforeEach
    public void setUp() {
        app = new Solution();
    }

    @Test
    public void testFirstLeetCodeExample() {
        expected = "bacdfeg";
        inputStr = "abcdefg";
        k = 2;
        results = app.reverseStr(inputStr, k);
        assertEquals(expected, results);
    }

    @Test
    public void testFirstLeetCodeExampleButMuchLonger() {
        expected = "bacdfeghjiklnmop";
        inputStr = "abcdefghijklmnop";
        k = 2;
        results = app.reverseStr(inputStr, k);
        assertEquals(expected, results);
    }

    @Test
    public void testFirstLeetCodeExampleButWithKValueOfThree() {
        expected = "cbadefihgjklonmpq";
        inputStr = "abcdefghijklmnopq";
        k = 3;
        results = app.reverseStr(inputStr, k);
        assertEquals(expected, results);
    }

    @Test
    public void testLettersLessThanKValue() {
        expected = "cba";
        inputStr = "abc";
        k = 4;
        results = app.reverseStr(inputStr, k);
        assertEquals(expected, results);
    }

    @Test
    public void testLettersKValueOfOne() {
        expected = "abcdef";
        inputStr = "abcdef";
        k = 1;
        results = app.reverseStr(inputStr, k);
        assertEquals(expected, results);
    }

    @Test
    public void testFirstFailFromLeetCodeSubmission() {
        expected = "cbadefg";
        inputStr = "abcdefg";
        k = 3;
        results = app.reverseStr(inputStr, k);
        assertEquals(expected, results);
    }
}
