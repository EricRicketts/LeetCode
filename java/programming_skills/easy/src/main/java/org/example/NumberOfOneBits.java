package org.example;

public class NumberOfOneBits {

    public int hammingWeight(int n) {
        String numericString = Integer.toBinaryString(n);
        return numericString.replaceAll("0", "").length();
    }
}
