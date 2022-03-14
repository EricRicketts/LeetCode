package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestPerimeterTriangleTest {

    LargestPerimeterTriangle largestPerimeterTriangle;
    @BeforeEach
    void setUp() {
        largestPerimeterTriangle = new LargestPerimeterTriangle();
    }

//    @Disabled
    @Test
    void largestPerimeterWithValidSides() {
        assertEquals(5, largestPerimeterTriangle.largestPerimeter(new int[]{2, 1, 2}));
    }

//    @Disabled
    @Test
    void largestPerimeterWithNonValidSides() {
        assertEquals(0, largestPerimeterTriangle.largestPerimeter(new int[]{1, 2, 1}));
    }

//    @Disabled
    @Test
    void setLargestPerimeterWithAllEqualSides() {
        assertEquals(3, largestPerimeterTriangle.largestPerimeter(new int[]{1, 1, 1, 1, 1, 1}));
    }

//    @Disabled
    @Test
    void setLargestPerimeterTriangleWithALargeRandomArrayOfSides() {
        int[] sides = new int[]{7, 10, 12, 5, 6, 13, 1, 14, 8, 9};
        assertEquals(39, largestPerimeterTriangle.largestPerimeter(sides));
    }

//    @Disabled
    @Test
    void setLargestPerimeterTriangleFixFailedTest() {
        int[] sides = new int[]{3, 6, 2, 3};
        assertEquals(8, largestPerimeterTriangle.largestPerimeter(sides));
    }

//    @Disabled
    @Test
    void fixAnotherFailedTest() {
        int[] sides = new int[]{1,2,2,4,18,8};
        assertEquals(5, largestPerimeterTriangle.largestPerimeter(sides));
    }
}