package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionFirstProblemTest {

    SolutionFirstProblem solutionFirstProblem;
    @BeforeEach
    void setUp() {
        solutionFirstProblem = new SolutionFirstProblem();
    }

    @Test
    void countOddsOddToOdd() {
        int low = 3, high = 11;
        assertEquals(5, solutionFirstProblem.countOdds(low,  high));
    }

    @Test
    void countOddsEvenToEven() {
        int low = 2, high = 10;
        assertEquals(4, solutionFirstProblem.countOdds(low,  high));
    }

    @Test
    void countOddsTwoAdjacentEvents() {
        int low = 8, high = 10;
        assertEquals(1, solutionFirstProblem.countOdds(low, high));
    }

    @Test
    void countOddsTestEqualEvenNumbers() {
        int low = 2, high = 2;
        assertEquals(0, solutionFirstProblem.countOdds(low, high));
    }
}
/*
    [3, 4, 5, 6, 7, 8, 9, 10, 11]
    11 - 3 = 8 + 1 = 9, odd numbers = Math.ceil(9/2);
    [2, 3, 4, 5, 6, 7, 8, 9, 10]
    reduces to [3, 4, 5, 6, 7, 8, 9]; 9 - 3 = 6
    Math.ceil(7/2) = 4
*/