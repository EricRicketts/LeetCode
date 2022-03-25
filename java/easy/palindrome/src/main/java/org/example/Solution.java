package org.example;

public class Solution {
    public boolean isPalindrome(int x) {
        String reversedNumber = new StringBuilder(Integer.toString(x)).reverse().toString();
        String number = Integer.toString(x);

        return number.equals(reversedNumber);
    }
}
