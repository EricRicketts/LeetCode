package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public String reverseIndividualWords(String s) {
        String[] wordArray = s.split("\\s+");
        List<StringBuilder> reversedWordList = Arrays.stream(wordArray)
            .map(word -> new StringBuilder(word).reverse())
            .toList();
        return String.join(" ", reversedWordList);
    }
}
/*
    Algorithm
    1.  Split the string into an array of words
    2.  I think one can call a stream on an array
    3.  Run a mapping function
        1.  turn each word in a StringBuilder object
        2.  reverse the StringBuilder object
    4.  Run String.join on the collection
*/
