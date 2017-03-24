//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        final int maxValue = 100;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[maxValue];
        
        /* Save into buckets */
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            array[num]++;
        }
        scan.close();
        
        /* Print all elements, sorted */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print(i + " ");
            }
        }
    }
}
