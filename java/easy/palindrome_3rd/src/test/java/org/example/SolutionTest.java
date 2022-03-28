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
    public void testReverseOddDigitPalindromeNumber() { assertTrue(solution.isPalindrome(1234321)); }

    //    @Disabled
    @Test
    public void testReverseSimpleNumberWhichIsNotPalindrome() {
        assertFalse(solution.isPalindrome(1234));
    }

    //    @Disabled
    @Test
    public void testNegativeNumber() {
        assertFalse(solution.isPalindrome(-121));
    }

    //    @Disabled
    @Test
    public void testNumberEndingInZero() {
        assertFalse(solution.isPalindrome(10));
    }

//    @Disabled
    @Test
    public void testEvenPalindromeNumber() { assertTrue(solution.isPalindrome(567765)); }

//    @Disabled
    @Test
    public void testPalindromeNumberWithZeros() { assertTrue(solution.isPalindrome(10301)); }
}
