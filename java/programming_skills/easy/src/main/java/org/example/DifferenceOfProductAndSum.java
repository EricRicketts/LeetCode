package org.example;

public class DifferenceOfProductAndSum {
    public int subtractProductAndSum(int n) {
        int productOfDigits = 1, sumOfDigits = 0;
        while (n != 0) {
            int digit = n % 10;
            productOfDigits *= digit;
            sumOfDigits += digit;
            n /= 10;
        }
        return productOfDigits - sumOfDigits;
    }
}
