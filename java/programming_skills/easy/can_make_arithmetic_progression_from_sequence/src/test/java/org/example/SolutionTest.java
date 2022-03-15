package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution;
    int[] sequence;
    @BeforeEach
    public void setUp() {
       solution = new Solution();
    }

//    @Disabled
    @Test
    public void testValidSequence() {
        sequence = new int[]{3, 5, 1};
        assertTrue(solution.canMakeArithmeticProgression(sequence));
    }

//    @Disabled
    @Test
    public void testInvalidSequence() {
        sequence = new int[]{1, 2, 4};
        assertFalse(solution.canMakeArithmeticProgression(sequence));
    }
}
