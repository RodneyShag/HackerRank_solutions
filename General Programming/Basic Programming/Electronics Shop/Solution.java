// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;
import java.util.Arrays;

// Algorithm: 
//     1. Sort both arrays.
//     2. Linearly walk through both arrays (at the same time).
//        If the combined price is unaffordable, find a cheaper harddrive (j--).
//        If the combined price is too low, update "max", and find a more expensive keyboard (i++)

// Time complexity: O(n log n + m log m)
// Space complexity: Depends on space complexity of Arrays.sort()

public class Solution {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards); // O(n log n) time complexity
        Arrays.sort(drives);    // O(m log m) time complexity
        int max = -1;
        int i = 0;
        int j = drives.length - 1;
        while (i < keyboards.length && j >= 0) { // O(n + m) time complexity
            int cost = keyboards[i] + drives[j];
            if (cost > b) {
                j--; // look for a cheaper hard drive
            } else {
                if (cost > max) {
                    max = cost;
                }
                i++; // look for a more expensive keyboard
            }
        }
        return max;
    }

    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] keyboards = new int[n];
        for (int i = 0; i < n; i++) {
            keyboards[i] = scan.nextInt();
        }
        int[] drives = new int[m];
        for (int i = 0; i < m; i++) {
            drives[i] = scan.nextInt();
        }
        scan.close();
        
        /* Calculate result */
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
