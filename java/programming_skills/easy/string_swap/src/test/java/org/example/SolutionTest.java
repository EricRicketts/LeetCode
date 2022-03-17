package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    Solution solution;
    String targetWord, word;
    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

//    @Disabled
    @Test
    public void testValidSwapCase() {
        targetWord = "bank"; word = "kanb";
        assertTrue(solution.areAlmostEqual(targetWord, word));
    }

    //    @Disabled
    @Test
    public void testValidSwapCaseInnerLettersBiggerWord() {
        targetWord = "foobarfizzbuzz"; word = "foofarbizzbuzz";
        assertTrue(solution.areAlmostEqual(targetWord, word));
    }

//    @Disabled
    @Test
    public void testSameWords() {
        targetWord = "kelb"; word = "kelb";
        assertTrue(solution.areAlmostEqual(targetWord, word));
    }

//    @Disabled
    @Test
    public void testInvalidSwapCase() {
        targetWord = "attack"; word = "defend";
        assertFalse(solution.areAlmostEqual(targetWord, word));
    }

//    @Disabled
    @Test
    public void testOneLetterStringsTheSame() {
        assertTrue(solution.areAlmostEqual("a", "a"));
    }

//    @Disabled
    @Test
    public void testOneLetterStringsAreDifferent() {
        assertFalse(solution.areAlmostEqual("a", "b"));
    }

//    @Disabled
    @Test
    public void testTwoLetterStringsAreTheSame() {
        assertTrue(solution.areAlmostEqual("ab", "ba"));
    }

//    @Disabled
    @Test
    public void testTwoLetterStringsAreDifferent() {
        assertFalse(solution.areAlmostEqual("ab", "zx"));
    }
}
