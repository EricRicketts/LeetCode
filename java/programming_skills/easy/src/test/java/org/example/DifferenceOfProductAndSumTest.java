package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceOfProductAndSumTest {

    DifferenceOfProductAndSum differenceOfProductAndSum;
    @BeforeEach
    void setUp() {
        differenceOfProductAndSum = new DifferenceOfProductAndSum();
    }

    @Test
    void subtractProductAndSumFirstNumber() {
        assertEquals(15, differenceOfProductAndSum.subtractProductAndSum(234));
    }

    @Test
    void subtractProductAndSumSecondNumber() {
        assertEquals(21, differenceOfProductAndSum.subtractProductAndSum(4421));
    }
}