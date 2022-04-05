package org.example;

public class Solution {
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        int lastIndexOfCharArray = charArray.length - 1;
        int characterIndex = 0;
        int[] reversableIndices = this.getReversableIndices(characterIndex, k, lastIndexOfCharArray);
        while (characterIndex <= lastIndexOfCharArray & reversableIndices.length > 0) {
            this.reverseCharacters(charArray, reversableIndices);
            characterIndex = this.getFirstIndexOfIndicesToReverse(characterIndex, k);
            reversableIndices = this.getReversableIndices(characterIndex, k, lastIndexOfCharArray);
        }
        return String.valueOf(charArray);
    }

    private int getFirstIndexOfIndicesToReverse(int characterIndex, int skipValue) {
        return characterIndex + 2 * skipValue;
    }

    private int[] getReversableIndices(int startingIndex, int skipValue, int lastIndexOfCharArray) {
        int lastIndex, index = 0;
        boolean atEndOfStringAndNotEnoughLettersToReverse = lastIndexOfCharArray >= startingIndex &&
            lastIndexOfCharArray < startingIndex + skipValue - 1;
        if (lastIndexOfCharArray < skipValue - 1) {
            lastIndex = lastIndexOfCharArray;
        } else if (atEndOfStringAndNotEnoughLettersToReverse) {
            return new int[]{};
        } else {
           lastIndex = startingIndex + skipValue - 1;
        }
        int[] reversableIndices = new int[lastIndex + 1];
        while (index <= lastIndex) {
            reversableIndices[index] = startingIndex + index;
            index++;
        }
        return reversableIndices;
    }

    private void reverseCharacters(char[] charArray, int[] indicesToReverse) {
        int startIndex = indicesToReverse[0];
        int lastIndex = indicesToReverse[indicesToReverse.length - 1];

        while (lastIndex >= startIndex) {
            char temp = charArray[startIndex];
            charArray[startIndex] = charArray[lastIndex];
            charArray[lastIndex] = temp;
            startIndex++;
            lastIndex--;
        }
    }
}

/*
    So getting the reversible indices is key to handling the edge condtions
    1.  I will need to pass in the charArray, but possibly only the last index of the charArray
    2.  Let's start with the case where the char array is less than the k value
        1.  Lets say we have string "abc" and k = 4
        2.  the last index would be 4 - 1 = 3 in this case
        3.  So we check if the string is less than 3 then we reverse all chars, but if it equals 3, say we have
        "abcd" then we do reverse
    3.  Now the remaining case is where we have letters that are greater than k but less than 2k and by extension
    greater than nk but less than (n+1)k
        1.  Say we have "abc def g" k = 3 result would be "cba def g", we only reverse in this case if we have
        a full three letters to reverse
        2.  in this case the starting index is 6, k = 3 so the lastIndex is 6 + 3 - 1 = 8, thus the target indices
        to reverse are 6, 7, 8.
        3.  so our test is if the lastIndexOfArray >= starting Index and lastIndexOfArray < starting index + skip value
        - 1.
        4.  if that condition is met we just return, we do not do anything with the last letters
*/