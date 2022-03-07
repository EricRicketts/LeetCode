package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageSalaryTest {

    AverageSalary averageSalary;
    int[] salaries;
    @BeforeEach
    void setUp() {
        averageSalary = new AverageSalary();
    }

    @Test
    void averageWithFourElementArray() {
        salaries = new int[]{4000,3000,1000,2000};
        assertEquals(2500.00000, averageSalary.average(salaries));
    }

    @Test
    void averageWithThreeElementArray() {
        salaries = new int[]{1000, 2000, 3000};
        assertEquals(2000.00000, averageSalary.average(salaries));
    }
}