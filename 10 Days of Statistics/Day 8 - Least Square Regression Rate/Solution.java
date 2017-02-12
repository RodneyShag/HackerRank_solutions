//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Hardcoded data */
        int [] x = {95, 85, 80, 70, 60};
        int [] y = {85, 95, 70, 65, 70};
        double studentScore = 80;
        
        /* Get coefficients for Least Square Regression Line */
        double b = pearson(x, y) * (standardDeviation(y) / standardDeviation(x));
        double a = getMean(y) - b * getMean(x);
        
        /* Calculate and print predicted score */
        double result = a + b * studentScore;
        System.out.format("%.3f", result);
    }
    
    /* Calculates Pearson coefficient */
    private static Double pearson(int [] xs, int [] ys) {
        if (xs == null || ys == null || xs.length != ys.length) {
            return null;
        }
        double xMean = getMean(xs);
        double yMean = getMean(xs);
        int n = xs.length;
        
        double numerator = 0;
        for (int i = 0; i < n; i++) {
            numerator += (xs[i] - xMean) * (ys[i] - yMean);
        }
        return numerator / (n * standardDeviation(xs) * standardDeviation(ys));
    }
    
    private static Double getMean(int [] array) {
        if (array == null) {
            return null;
        }
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return (double) total / array.length;
    }

    private static Double standardDeviation(int [] array) {
        if (array == null) {
            return null;
        }
        double mean = getMean(array);
        int sum = 0;
        for (double x : array) {
            sum += Math.pow(x - mean, 2);
        }
        double variance = sum / array.length;
        return Math.sqrt(variance);
    }
}
