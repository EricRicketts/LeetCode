package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution;
    int[] expected, results, nums;
    int target;
    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

//    @Disabled
    @Test
    public void testFourElementArray() {
        nums = new int[]{2,7,11,15};
        target = 9;
        expected = new int[]{0, 1};
        results = solution.twoSum(nums, target);
        assertArrayEquals(expected, results);
    }

//    @Disabled
    @Test
    public void testThreeElementArray() {
        int[] nums = new int[]{3, 2, 4};
        expected = new int[]{1, 2};
        target = 6;
        results = solution.twoSum(nums, target);
        assertArrayEquals(expected, results);
    }

//    @Disabled
    @Test
    public void testTwoElementArray() {
        int[] nums = new int[]{3, 3};
        expected = new int[]{0, 1};
        target = 6;
        results = solution.twoSum(nums, target);
        assertArrayEquals(expected, results);
    }

    @Test
    public void testMuchLargerArray() {
        int[] nums = new int[]{11, 25, 2, 17, 8, 4, 9, 13, 16, 7};
        expected = new int[]{3, 5};
        target = 21;
        results = solution.twoSum(nums, target);
        assertArrayEquals(expected, results);
    }
}
