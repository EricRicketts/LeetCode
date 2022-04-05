package org.example;

public class Solution {
    public String reverseString(String s, int k) {
        char[] charArray = s.toCharArray();
        int numberOfCharacters = charArray.length;
        int characterIndex = 0;
        int coefficient = 0;
        int[] reversableIndices = this.getReversableIndices(characterIndex, k);
        while (characterIndex < numberOfCharacters) {
            this.reverseCharacters(charArray, reversableIndices);
            characterIndex = this.getFirstIndexOfIndicesToReverse(characterIndex, k);
            reversableIndices = this.getReversableIndices(characterIndex, k);
        }
        return String.valueOf( charArray);
    }

    private int getFirstIndexOfIndicesToReverse(int characterIndex, int skipValue) {
        return characterIndex + 2 * skipValue;
    }

    private int[] getReversableIndices(int startingIndex, int indexRange) {
        int[] reversableIndices = new int[indexRange];
        int index = 0;
        while (index < indexRange) {
            reversableIndices[index] = startingIndex + index;
            index++;
        }
        return reversableIndices;
    }

    private void reverseCharacters(char[] charArray, int[] indicesToReverse) {
        int startIndex = indicesToReverse[0];
        int lastIndex = charArray.length < indicesToReverse.length ?
                charArray.length - 1
                : indicesToReverse[indicesToReverse.length - 1];

        while (lastIndex >= startIndex) {
            char temp = charArray[startIndex];
            charArray[startIndex] = charArray[lastIndex];
            charArray[lastIndex] = temp;
            startIndex++;
            lastIndex--;
        }
    }
}