package org.example;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        boolean isPalindromeNumber = true;
        int highDigitsNumber = x;
        int lowDigitsNumber = x;
        int highestPowerOfTen = (int)Math.log10(x);
        int loopIterations = highestPowerOfTen % 2 == 0 ? highestPowerOfTen / 2 + 1 : (highestPowerOfTen + 1) / 2 + 1;

        int iteration = 0;
        int lowDigit = 0, highDigit = 0;
        while (iteration < loopIterations) {
            int currentPowerOfTen = (int)(Math.pow(10, highestPowerOfTen - iteration));
            lowDigit = lowDigitsNumber % 10;
            lowDigitsNumber /= 10;
            highDigit = highDigitsNumber / currentPowerOfTen;
            highDigitsNumber = highDigitsNumber % currentPowerOfTen;
            if (lowDigit != highDigit) {
                isPalindromeNumber = false;
                break;
            }
            iteration++;
        }
        return isPalindromeNumber;
    }
}
/*
    Algorithm I wanted to try one more algorithm which still only iterated through half of the number but
    admittedly was more complicated that the LeetCode solution.

    1.  Based on the highest power of ten of the number determine the iterations required to iterate only
    through half of the number.
    2.  for each iteration:
        1.  Pick off the low digit
        2.  Pick off the high digit
        3.  If the digits do not match break out of the loop and return false

    Let us run through an example:  Take the number 123321
    One important factor to note I have a highDigitNumber and a lowDigitNumber, the reason for this is that isolating
    a trailing digit and leading digit are the opposite of one another
    lowDigit use % 10 to pick off the least significant digit
    lowDigit new number use / 10  to create a new number with the last digit removed
    highDigit use / high power of ten to pick off the most significant digit
    highDigit use % high power of ten to create a new number with the first digit removed
    Note the highest power of ten varies as you go through the loop, fortunately if we track the number of iterations
    we can use this to continually decrement the highest power of ten.

*/
