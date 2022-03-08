package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfOneBitsTest {

    NumberOfOneBits numberOfOneBits;
    int n;

    @BeforeEach
    void setUp() {
        numberOfOneBits = new NumberOfOneBits();
    }

    @Test
    void hammingWeightForThreeOnes() {
        n = 00000000000000000000000000001011;
        assertEquals(3, numberOfOneBits.hammingWeight(n));
    }

    @Test
    void hammingWeightForOneOne() {
        n = 00000000000000000000000010000000;
        assertEquals(1, numberOfOneBits.hammingWeight(n));
    }
}
