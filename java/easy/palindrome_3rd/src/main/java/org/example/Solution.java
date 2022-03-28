package org.example;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedNumber = 0;
        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }
        return (x == reversedNumber || x == reversedNumber / 10);
    }
}
/*
    This algorithm was taken from the LeetCode solution, it is simple and elegant
    Let use an example number to see how it works
    Take the number 123321
    1.  We set reversedNumber to 0.
    2.  first reversedNumber is 0 * 10 + 123321 % 10 = 0 + 1 = 1;
    3.  Remove the last digit from the current number 123321 / 10 = 12332
    4.  Do it again: reversedNumber = 1*10 + 12332 % 10 = 10 + 2 = 12, 12332 / 10 = 1233
    5.  Do it once more 12 * 10 + 1233 % 10 = 120 + 3 = 123; x = 1233 / 10 = 123
    6.  Now x = 123 and reversedNumber = 123 so x is not longer > reversedNumber, we break out of the loop

    What about odd digits, using a similar number 1234321
    1.  At the same point above we have reversedNumber = 123, x = 1234
    2.  Once more we have reversedNumber = 1234 and x = 123
    3.  But x = 1234 / 10 = 123, so this is the necessary second check at the end of the method.

    Now lets try with zeros in the number, say 10033001
    Note below we have for each iteration reversedNumber, x
    1.  1, 1003300
    2.  10, 100330
    3.  100, 10033
    4.  1003, 1003 - works

*/
