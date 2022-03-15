package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    private Solution solution;
    int[] numbers;
    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

//    @Disabled
    @Test
    public void testMixOfPositiveAndNegativeNumbers() {
        numbers = new int[]{-1,-2,-3,-4,3,2,1};
        assertEquals(1, solution.arraySign(numbers));
    }

//    @Disabled
    @Test
    public void testMixOfZeroInArray() {
        numbers = new int[]{1,5,0,2,-3};
        assertEquals(0, solution.arraySign(numbers));
    }

//    @Disabled
    @Test
    public void testMixOfOnesAndNegativeOnes() {
        numbers = new int[]{-1, 1, -1, 1, -1};
        assertEquals(-1, solution.arraySign(numbers));
    }

    //    @Disabled
    @Test
    public void testLargerNumbers() {
        numbers = new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        assertEquals(-1, solution.arraySign(numbers));
    }
}
