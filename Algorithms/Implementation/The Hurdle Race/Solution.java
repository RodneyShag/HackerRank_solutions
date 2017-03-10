//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int [] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = scan.nextInt();
        }
        scan.close();
        
        /* Calculate # of magic beverages needed */
        int maxHeight = Arrays.stream(height).max().getAsInt();
        System.out.println(Math.max(maxHeight - k, 0));
    }
}
