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
    public void testSmallerHappyNumber() {
        assertTrue(solution.isHappy(7));
    }

//    @Disabled
    @Test
    public void testLargerHappyNumber() {
        assertTrue(solution.isHappy(338));
    }

//    @Disabled
    @Test
    public void testSmallerNonHappyNumber() {
        assertFalse(solution.isHappy(6));
    }

//    @Disabled
    @Test
    public void testLargerNonHappyNumber() {
        assertFalse(solution.isHappy(318));
    }
}
