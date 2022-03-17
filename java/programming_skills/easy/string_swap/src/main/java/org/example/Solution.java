package org.example;

public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        if (s1.length() == 1) return false;
        int lastIndex = s1.length() - 1;

        for (int outerIndex = 0; outerIndex < lastIndex; outerIndex++) {
            for (int innerIndex = outerIndex; innerIndex < lastIndex; innerIndex++) {
                char[] chars = s2.toCharArray();
                int nextIndex = innerIndex + 1;
                char temp = chars[outerIndex];
                chars[outerIndex] = chars[nextIndex];
                chars[nextIndex] = temp;
                String stringWithSwappedChars = String.valueOf(chars);
                if (s1.equals(stringWithSwappedChars)) return true;
            }
        }
        return false;
    }
}
