package org.example;

public class Solution {
    public void reverseString(char[] s) {
        this.helper(0, s.length - 1, s);
    }

    private void helper(int startIndex, int endIndex, char[] s) {
        if (startIndex > endIndex) return;
        char temp = s[startIndex];
        s[startIndex] = s[endIndex];
        s[endIndex] = temp;
        helper(startIndex+1, endIndex-1, s);
    }
}
