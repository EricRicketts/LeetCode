package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    Solution solution;
    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

//    @Disabled
    @Test
    public void testOneRow() {
        List<List<Integer>> expected = List.of(List.of(1));
        assertEquals(expected, solution.generate(1));
    }

    //    @Disabled
    @Test
    public void testTwoRows() {
        List<List<Integer>> expected = List.of(List.of(1), List.of(1, 1));
        assertEquals(expected, solution.generate(2));
    }

//        @Disabled
    @Test
    public void testThreeRows() {
        List<List<Integer>> expected = List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1));
        assertEquals(expected, solution.generate(3));
    }

//        @Disabled
    @Test
    public void testFourRows() {
        List<List<Integer>> expected = List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1));
        assertEquals(expected, solution.generate(4));
    }

//        @Disabled
    @Test
    public void testFiveRows() {
        List<List<Integer>> expected = List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1),
            List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1));
        assertEquals(expected, solution.generate(5));
    }

//        @Disabled
    @Test
    public void testSixRows() {
        List<List<Integer>> expected = List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1),
            List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1), List.of(1, 5, 10, 10, 5, 1));
        assertEquals(expected, solution.generate(6));
    }

//        @Disabled
    @Test
    public void testSevenRows() {
        List<List<Integer>> expected = List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1),
                List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1), List.of(1, 5, 10, 10, 5, 1),
                List.of(1, 6, 15, 20, 15, 6, 1));
        assertEquals(expected, solution.generate(7));
    }

}
