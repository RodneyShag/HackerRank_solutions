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
        
        System.out.println(negativeSubarrays(array));
    }
    
    /* O(n^2) runtime */
    private static int negativeSubarrays(int [] array) {
        int count = 0;
        int sum   = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }
            sum = 0;
        }
        return count;
    }
}
