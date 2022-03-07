package org.example;

public class SolutionFirstProblem {
    public int countOdds(int low, int high) {
        if (low == high & (low % 2 == 0 & high % 2 == 0)) return 0;
        int newLow = low % 2 == 0 ? low + 1 : low;
        int newHigh = high % 2 == 0 ? high - 1 : high;
        return (newHigh - newLow + 1)/2 + 1;
    }
}