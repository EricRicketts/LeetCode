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
    public void testTwoWordReversal() {
        expected = "olleH dlroW";
        assertEquals(expected, app.reverseIndividualWords("Hello World"));
    }

    @Test
    public void testFiveWordReversal() {
        expected = "ooF raB zziF zzuB toT";
        assertEquals(expected, app.reverseIndividualWords("Foo Bar Fizz Buzz Tot"));
    }
}
