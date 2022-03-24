package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sizeOfArray = nums.length;
        Map<Integer, Integer> valuesAndIndices = new HashMap<>();
        for (int index = 0; index < sizeOfArray; index++) {
            int firstNumber = nums[index];
            int secondNumber = target - firstNumber;
            if (valuesAndIndices.containsKey(secondNumber)) {
                return new int[]{valuesAndIndices.get(secondNumber), index};
            }
            valuesAndIndices.put(firstNumber, index);
        }
        return null;
    }
}
