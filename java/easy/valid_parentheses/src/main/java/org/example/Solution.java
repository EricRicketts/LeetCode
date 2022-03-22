package org.example;

import java.util.Map;
import java.util.Stack;

public class Solution {
    private final Map<Character, Character> openingAndClosingChars = Map.of('(', ')',
    '[', ']', '{', '}');

    public boolean isValid(String s) {
        Stack<Character> openingChars = new Stack<>();
        for (int index = 0; index < s.length(); index++) {
            Character currentChar = s.charAt(index);
            if (this.isOpeningChar(currentChar)) {
                openingChars.push(currentChar);
            } else {
                boolean invalidChar = openingChars.empty() ||
                    !openingAndClosingChars.get(openingChars.pop()).equals(currentChar);
                if (invalidChar) return false;
            }

        }
        return openingChars.empty();
    }

    private boolean isOpeningChar(Character ch) {
        Character[] openingChars = this.openingAndClosingChars.keySet().toArray(new Character[0]);
        for (Character openingChar:openingChars) {
            if (openingChar.equals(ch)) return true;
        }
        return false;
    }
}
/*
    Algorithm
    1.  If the character is an opening character push it onto the stack
    2.  If the character is a closing character
        1.  if the stack is empty return false.
        2.  If the mapped value of the popped character does not match the current character return false
*/
