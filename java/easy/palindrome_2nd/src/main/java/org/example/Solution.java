package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        List<Integer> reversedDigits = new ArrayList<>();
        List<Integer> digits = new ArrayList<>();

        int remainingNumber = x;
        while (remainingNumber != 0) {
            int digit = remainingNumber % 10;
            reversedDigits.add(digit);
            digits.add(0, digit);
            remainingNumber /= 10;
        }

        return digits.equals(reversedDigits);
    }
}
/*
    the algorithm works but it is slow
    1.  define two lists, one to keep the digits in their original order another to keep the digits in reversed order
    2.  for the reversed list push it on
    3.  for the normal order shift it on
    4.  compare the lists at the end.
*/