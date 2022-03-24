package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valuesAndIndices = new HashMap<>();
        int sizeOfArray = nums.length;
        for (int index = 0; index < sizeOfArray; index++) valuesAndIndices.put(nums[index], index);
        for (int index = 0; index < sizeOfArray; index++) {
            int firstNumber = nums[index];
            int secondNumber = target - firstNumber;
            Integer indexOfSecondNumber = valuesAndIndices.get(secondNumber);
            if (valuesAndIndices.containsKey(secondNumber) && indexOfSecondNumber != index) {
                return new int[]{ index, indexOfSecondNumber};
            }
        }
        return null;
    }
}
/*
    Algorithm:

*/
