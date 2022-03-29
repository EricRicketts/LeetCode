package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public String reverseIndividualWords(String s) {
        String[] strArray = s.split("\\s+");
        List<StringBuilder> reversedWords = new ArrayList<>();
        for (String word:strArray) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedWords.add(reversedWord);
        }
        return String.join(" ", reversedWords);
    }
}
/*
    Algorithm
    1.  Split the string using a regex which returns an array of words
    2.  Initialize and empty StringBuilder object
    3.  Loop through the array
        1.  for each word reverse it
        2.  append it to the current StringBuilder object
    4.  Convert the answer to a string by joining with a space
*/
