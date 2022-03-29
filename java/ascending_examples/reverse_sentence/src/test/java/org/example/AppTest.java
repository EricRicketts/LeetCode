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
    public void shouldAnswerWithTrue() {
        expected = "pass not shall you";
        results = app.reversePhrase("you shall not pass");
        assertEquals(expected, results);
    }
}
