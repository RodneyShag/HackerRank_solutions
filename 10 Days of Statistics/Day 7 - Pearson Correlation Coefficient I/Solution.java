//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double [] xs = new double[size];
        double [] ys = new double[size];
        for (int i = 0; i < size; i++) {
            xs[i] = scan.nextDouble();
        }
        for (int i = 0; i < size; i++) {
            ys[i] = scan.nextDouble();
        }
        
        System.out.println(pearson(xs, ys));
    }

    /* Calculates Pearson coefficient */
    private static Double pearson(double [] xs, double [] ys) {
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
    
    private static Double getMean(double [] array) {
        if (array == null) {
            return null;
        }
        double total = 0;
        for (double num : array) {
            total += num;
        }
        return total / array.length;
    }

    private static Double standardDeviation(double [] array) {
        if (array == null) {
            return null;
        }
        double mean = getMean(array);
        double sum = 0;
        for (double x : array) {
            sum += Math.pow(x - mean, 2);
        }
        double variance = sum / array.length;
        return Math.sqrt(variance);
    }
}
