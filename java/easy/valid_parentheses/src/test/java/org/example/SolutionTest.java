package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution;
    String s;
    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void simpleMatchingParentheses() {
        s = "()";
        assertTrue(solution.isValid(s));
    }

    @Test
    public void matchMultipleOpeningAndClosingChars() {
        s = "()[]{}";
        assertTrue(solution.isValid(s));
    }

    @Test
    public void simpleMismatch() {
        s = "(]";
        assertFalse(solution.isValid(s));
    }

    @Test
    public void testMoreComplicatedMatch() {
        s = "((({()}[{()}])))";
        assertTrue(solution.isValid(s));
    }

    @Test
    public void testMoreComplicatedMismatch() {
        s = "(([]){}";
        assertFalse(solution.isValid(s));
    }
}
