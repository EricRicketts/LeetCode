package org.example;

public class AverageSalary {
    public double average(int[] salary) {
        double maxSalary = 999.0;
        double minSalary = 1_000_001.0;
        double sumOfSalaries = 0.0;
        for (int oneSalary:salary) {
            if (oneSalary > maxSalary) maxSalary = oneSalary;
            if (oneSalary < minSalary) minSalary = oneSalary;
            sumOfSalaries += oneSalary;
        }
        return (sumOfSalaries - (maxSalary + minSalary)) / (salary.length - 2);
    }
}