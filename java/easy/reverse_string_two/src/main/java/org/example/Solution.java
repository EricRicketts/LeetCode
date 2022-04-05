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
/*
    Algorithm
    so let's run through this with some examples, "abcdefghijk" result is "bacdfeghjik" note here are the indices
    which were switched: 0, 1, 4, 5, 8, 9 we have this result for k = 2.  it switches letters every 2k.  Note
    there is a k + 1 difference between switching groups.  In this case the difference is 3.  Let's see if this
    works for k = 3.  "abc def ghi jkl mno" would be "cba def ihg jkl onm"  reversed indices are 0, 1, 2, 6, 7, 8,
    12, 13, 14 so the index difference between groups is k + 1.

    "ab cd ef gh ij kl mn op qr st uv wx" => "ba cd fe gh ji kl nm op rq st vu wx"
    01 45 89 12|13 16|17 20|21 (0 2k 4k 6k 8k 10k) so you add 2 to the coefficient each time

    1.  for each pass calculate the new coefficient
    2.  make a method to calculate the next coefficient based on the current coefficient
    3.  once the current coefficient is known calculate the array of indices which will be used to reverse
        the string
    4.  reverse the string and then advance to the next group of letters to reverse

    So calculating the new starting index is important.
    for k = 2 we have 0, 4, 8, 12, 16, 20
    old + 2*k (old = 0, new = 4; old = 4, new = 8; old = 8, new = 12)
    for k = 3 we have 0, 6, 12, 18
    old + 2*k, (0, 6, 12, 18)
*/
