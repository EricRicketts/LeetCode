package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    App app;
    String expected, results;
    @BeforeEach
    public void setUp() {
        app = new App();
    }

    @Test
    public void testReverseTwoWordSentence() {
        expected = "olleH dlroW";
        results = app.reverseIndividualWords("Hello World");
        assertEquals(expected, results);
    }

    @Test
    public void testThreeWordSentence() {
        expected = "skeeG rof skeeG";
        results = app.reverseIndividualWords("Geeks for Geeks");
        assertEquals(expected, results);
    }
}
