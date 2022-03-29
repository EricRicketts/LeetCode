package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public String reversePhrase(String phrase) {
        String[] wordArray = phrase.split("\\s+");
        List<String> reversedOrder = new ArrayList<>();
        int numberOfWords = wordArray.length;

        for (int index = numberOfWords - 1; index >= 0; index--) {
            reversedOrder.add(wordArray[index]);
        }
        return String.join(" ", reversedOrder);
    }
}
/*
    Algorithm:
    1.  Split the String on spaces, creating a List of Strings
    2.  Create an empty List<String>
    3.  Loop backwards through the array
        1.  for each word append it to the List
        2.  Loop ends when index = 0
    4.  Join the array on an empty space
    5.  return the resulting String
*/
