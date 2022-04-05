package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    App app;
    String expected;
    @BeforeEach
    public void setUp() {
        app = new App();
    }

    @Test
    public void testReverseTwoWordList() {
        expected = "Bar Foo";
        assertEquals(expected, app.reversePhrase("Foo Bar"));
    }

    @Test
    public void testReverseLongerSentence() {
        expected = "pass not shall you";
        assertEquals(expected, app.reversePhrase("you shall not pass"));
    }
}
