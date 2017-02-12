//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        System.out.format("%.1f", standardDeviation(array));
    }
    
    public static double getMean(int [] array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        return (double) sum / array.length;
    }
    
    public static double standardDeviation(int [] array) {
        double mean = getMean(array);
        double sum = 0;
        for (int x : array) {
            sum += Math.pow(x - mean, 2);
        }
        double variance = sum / array.length;
        return Math.sqrt(variance);
    }
}
