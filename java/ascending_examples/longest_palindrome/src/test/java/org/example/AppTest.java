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
    public void testLongestPalindromeOnlyOnePalindrome() {
        String input = "This is the first level very easy";
        expected = "level";
        results = app.longestPalindrome(input);
        assertEquals(expected, results);
    }

    @Test
    public void testTwoPalindromesOfSameLength() {
        String input = "mom data race car potato";
        expected = "mom";
        results = app.longestPalindrome(input);
        assertEquals(expected, results);
    }

    @Test
    public void testLongerOfTwoPalindromes() {
        String input = "mom my rotator cuff hurts";
        expected = "rotator";
        results = app.longestPalindrome(input);
        assertEquals(expected, results);
    }
}
