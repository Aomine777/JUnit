package org.example;

public class SumCalculator {
    public int sum(int n){
        if (n > 0) {
            return n*(n + 1) / 2;
        }
        throw new IllegalArgumentException("Значення не може бути 0 або менше нуля, введіть інше значення");
    }
}
