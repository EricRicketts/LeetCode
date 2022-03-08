package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaskingWithNMinusOneTest {

    MaskingWithNMinusOne maskingWithNMinusOne;
    @BeforeEach
    void setUp() {
        maskingWithNMinusOne = new MaskingWithNMinusOne();
    }

    @Test
    public void testHammingWeight() {
        int n = 00000000000000000000000101001011;
        assertEquals(5, maskingWithNMinusOne.hammingWeight(n));
    }
}