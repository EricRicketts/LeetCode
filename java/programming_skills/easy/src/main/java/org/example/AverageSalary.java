package org.example;

public class AverageSalary {
    public double average(int[] salary) {
        int maxSalary = 999;
        int minSalary = 1_000_001;
        int sumOfSalaries = 0;
        for (int oneSalary:salary) {
            if (oneSalary > maxSalary) maxSalary = oneSalary;
            if (oneSalary < minSalary) minSalary = oneSalary;
            sumOfSalaries += oneSalary;
        }
        return (double)(sumOfSalaries - (maxSalary + minSalary)) / (salary.length - 2);
    }
}