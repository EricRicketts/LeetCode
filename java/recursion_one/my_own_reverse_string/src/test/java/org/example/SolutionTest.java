package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution;
    char[] expected;
    char[] charAry;
    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testSimpleTwoLetterWord() {
        charAry = new char[]{'t', 'o'};
        expected = new char[]{'o', 't'};
        solution.reverseString(charAry);
        assertArrayEquals(expected, charAry);
    }

    @Test
    public void testSimpleThreeLetterWord() {
        charAry = new char[]{'t', 'w', 'o'};
        expected = new char[]{'o', 'w', 't'};
        solution.reverseString(charAry);
        assertArrayEquals(expected, charAry);
    }

    @Test
    public void testLongerEvenLetteredWord() {
        charAry = new char[]{'m', 'a', 'n', 'i', 'f', 'e', 's', 't'};
        expected = new char[]{'t', 's', 'e', 'f', 'i', 'n', 'a', 'm'};
        solution.reverseString(charAry);
        assertArrayEquals(expected, charAry);
    }

    @Test
    public void testLongerOddLetteredWord() {
        charAry = new char[]{'m', 'a', 'n', 'i', 'f', 'e', 's', 't', 's'};
        expected = new char[]{'s', 't', 's', 'e', 'f', 'i', 'n', 'a', 'm'};
        solution.reverseString(charAry);
        assertArrayEquals(expected, charAry);
    }

}
