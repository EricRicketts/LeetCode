package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int differenceCount = 0;
        int lengthOfString = s1.length();
        boolean matchingLetterPairs = false;
        List<Character> letterPairs = new ArrayList<>();
        for (int index = 0; index < lengthOfString; index++) {
            char firstStringLetter = s1.charAt(index);
            char secondStringLetter = s2.charAt(index);
            if (firstStringLetter != secondStringLetter) {
                differenceCount += 1;
                letterPairs.add(firstStringLetter);
                letterPairs.add(secondStringLetter);
            }
        }

        if (letterPairs.size() > 2) {
            matchingLetterPairs = (letterPairs.get(0) == letterPairs.get(3)) &&
                (letterPairs.get(1) == letterPairs.get(2));
        }
        return (differenceCount == 0) || (s1.length() == 1 && (s1.charAt(0) == s2.charAt(0))) ||
            (differenceCount == 2 && matchingLetterPairs);
    }
}
/*
    Algorithm
    1.  Only iterate over the string one time.
    2.  Set up an ArrayList
*/
