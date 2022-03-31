package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution;
    char[] s;
    char[] expected;
    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testReverseOddSizedArray() {
        s = new char[]{'h','e','l','l','o'};
        expected = new char[]{'o','l','l','e','h'};
        solution.reverseString(s);
        assertArrayEquals(expected, s);
    }

    @Test
    public void testReverseEvenSizedArray() {
        s = new char[]{'f','o','o','b','a', 'r'};
        expected = new char[]{'r','a','b', 'o', 'o','f'};
        solution.reverseString(s);
        assertArrayEquals(expected, s);
    }

}
