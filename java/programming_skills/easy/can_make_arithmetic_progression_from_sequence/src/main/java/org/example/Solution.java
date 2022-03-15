package org.example;

import java.util.Arrays;

public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int difference = 0;
        int lastIndex = arr.length - 1;
        for (int index = 0; index < lastIndex; index++) {
            if (index == 0) {
                difference = arr[index + 1] - arr[index];
            } else {
                if (difference != arr[index + 1] - arr[index]) return false;
            }
        }
        return true;
    }
}
/*
    Algorithm
    1.  First sort the array
    2.  loop through the array to the second to last index
    3.  the difference between the first two numbers should be the same for the entire array
    4.  So starting with indexes 1 and 2 if any difference does not match exit and return false
*/
