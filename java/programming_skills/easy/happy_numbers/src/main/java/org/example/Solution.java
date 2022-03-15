package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isHappy(int n) {
        List<Integer> priorSumOfDigitsSquare = new ArrayList<>();
        int newNumber = n;
        while (true) {
            if (newNumber == 1) {
                return true;
            } else {
                if (priorSumOfDigitsSquare.contains(newNumber)) return false;
                priorSumOfDigitsSquare.add(newNumber);
            }
            newNumber = this.sumOfDigitSquares(newNumber);
        }
    }

    private int sumOfDigitSquares(int n) {
        int sum = 0, quotient = n, remainder = 0;
        while (quotient != 0) {
            remainder = quotient % 10;
            sum += remainder * remainder;
            quotient /= 10;
        }
        return sum;
    }
}
/*
    Algorithm
    1.  Set up a List to store the result of summing the square of the digits
    2.  Run an infinite loop
    3.  Square the digits of the number
    4.  if the new number is 1 return true
    5.  if the new number was a prior number stored in the list return false

    Note write a method to square the digits of the number
*/
