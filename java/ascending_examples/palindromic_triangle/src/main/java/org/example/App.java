package org.example;

public class App {
    public int[] createPalindromicTriangle(int n) {
        int[] palindromicTriangle = new int[n];
        for (int row = 1; row <= n; row++) {
            int innerLoopLimit = 2*row - 1;
            int rowNumber = 0;
            for (int upCount = 1, downCount = innerLoopLimit;
                 upCount <= innerLoopLimit && downCount >= 1; upCount++,downCount--) {
                if (upCount <= row) {
                    rowNumber = rowNumber * 10 + upCount;
                } else {
                    rowNumber = rowNumber * 10 + downCount;
                }
            }
            int index = row - 1;
            palindromicTriangle[index] = rowNumber;
        }
        return palindromicTriangle;
    }
}
/*
    Algorithm
    1.  Loop from 1 to n which turns out to be the number of rows for the palindromic triangle
    2.  Inner loop hos two loop variables upCount which counts from 1 to number of numbers in row and downCount
    which counts down from number of numbers in the row down to 1.
    3.  the number is built by a simple arithmetic formula.
    4.  Once upCount = n we need to start adding the downCount numbers
*/
