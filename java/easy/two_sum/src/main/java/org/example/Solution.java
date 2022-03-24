package org.example;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSumIndices = new int[2];
        int numberArrayLength = nums.length;

        for (int firstIndex = 0; firstIndex < numberArrayLength - 1; firstIndex++) {
            int firstNumber = nums[firstIndex];
            for (int secondIndex = firstIndex + 1; secondIndex < numberArrayLength; secondIndex++) {
                int secondNumber = nums[secondIndex];
                if (target - firstNumber == secondNumber) {
                    twoSumIndices[0] = firstIndex;
                    twoSumIndices[1] = secondIndex;
                    return twoSumIndices;
                }
            }
        }
        return twoSumIndices;
    }
}
/*
    Algorithm
    1.  Declare an array of two elements
    2.  outer loop from 0 to one element before the last
    3.  inner loop takes starting point and checks
        1.  first index is outerloop index
        2.  advance to next index if target - number at outer index = current number we have found the match
    [2, 7, 11, 15] sort the array, target = 9
    [3, 2, 4] => [2, 3, 4]
*/