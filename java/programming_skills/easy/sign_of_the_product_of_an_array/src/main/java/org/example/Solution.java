package org.example;

public class Solution {
    public int arraySign(int[] nums) {
        int signOfProduct = 1;
        for (int number:nums) {
            if (number == 0) {
                return 0;
            } else {
                int sign = number < 0 ? -1 : 1;
                signOfProduct *= sign;
            }
        }
        return signOfProduct < 0 ? -1 : 1;
    }
}
/*
    Algorithm
    1.  cycle through the array
    2.  if any number is zero exit and return 0
    3.  We have an issue that the number will be too big and wrapping will occur, so we need to keep track of
    the sign of the product
    4.  if the number < 0 multiply the product by -1 if > 0 multiply by 1

    the first time I did this I got the wrong answer because as the product grew in size it became too big for an
    int type.  So what Java did was to start underflow or overflow meaning the sign of the product was now out of
    sync with my algorithm, so I had to keep a running product of the signs of each number.
*/
