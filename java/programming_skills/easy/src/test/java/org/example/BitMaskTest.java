package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitMaskTest {

    BitMask bitMask;
    @BeforeEach
    void setUp() {
        bitMask = new BitMask();
    }

    @Test
    void hammingWeight() {
        int n = 00000000000000000000000101001011;
        assertEquals(5, bitMask.hammingWeight(n));
    }
}