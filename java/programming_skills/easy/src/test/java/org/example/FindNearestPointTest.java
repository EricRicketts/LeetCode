package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNearestPointTest {

    FindNearestPoint findNearestPoint;
    int[][] points;
    int x, y;
    @BeforeEach
    void setUp() {
        findNearestPoint = new FindNearestPoint();
        x = 3;
        y = 4;
    }

    @Test
    void testNearestValidPointOneMatchingPoint() {
        points = new int[][]{{3, 4}};
        assertEquals(0, findNearestPoint.nearestValidPoint(x, y, points));
    }

    @Test
    void testNoMatchingPoints() {
        points = new int[][]{{2, 3}, {4, 3}};
        assertEquals(-1, findNearestPoint.nearestValidPoint(x, y, points));
    }

    @Test
    void testWithMultipleMatchingPoints() {
        points = new int[][]{{1,2},{3,1},{2,4},{2,3},{4,4}};
        assertEquals(2, findNearestPoint.nearestValidPoint(x, y, points));
    }
}