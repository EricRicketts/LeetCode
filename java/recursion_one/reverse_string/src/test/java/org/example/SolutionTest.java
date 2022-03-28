package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution;
    String[] s;
    String[] expected;
    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void shouldAnswerWithTrue() {
        s = new String[]{"h","e","l","l","o"};
        expected = new String[]{"o","l","l","e","h"};
        assertArrayEquals(expected);
    }

}
