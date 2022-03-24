package org.example;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution;
    int[] expected;
    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testFourElementArray() {
        int[] nums = new int[]{2,7,11,15};
        expected = new int[]{0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, 9));
    }

    @Test
    public void testThreeElementArray() {
        int[] nums = new int[]{3, 2, 4};
        expected = new int[]{1, 2};
        assertArrayEquals(expected, solution.twoSum(nums, 6));
    }

    @Test
    public void testTwoElementArray() {
        int[] nums = new int[]{3, 3};
        expected = new int[]{0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, 6));
    }

    @Test
    public void testMuchLargerArray() {
        int[] nums = new int[]{11, 25, 2, 17, 8, 4, 9, 13, 16, 7};
        expected = new int[]{3, 5};
        int[] results;
        results = solution.twoSum(nums, 21);
        assertArrayEquals(expected, solution.twoSum(nums, 21));
    }
}
