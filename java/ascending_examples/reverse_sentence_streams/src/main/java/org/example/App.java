package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public String reversePhrase(String s) {
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
