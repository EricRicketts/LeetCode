package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution;
    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

//    @Disabled
    @Test
    public void testReverseSimpleNumber() {
        assertTrue(solution.isPalindrome(121));
    }

    //    @Disabled
    @Test
    public void testNegativeNumber() {
        assertFalse(solution.isPalindrome(-121));
    }

    //    @Disabled
    @Test
    public void testTen() {
        assertFalse(solution.isPalindrome(10));
    }
}
