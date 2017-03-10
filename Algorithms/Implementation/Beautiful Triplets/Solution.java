//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.HashSet;

// We are given an increasing input sequence, so no duplicate values exist

//  Time Complexity: O(n)
// Space Complexity: O(n)

public class Solution {
    public static void main(String[] args) {
        /* Initialize variables */
        HashSet<Integer> set = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        int size     = scan.nextInt();
        int d        = scan.nextInt();
        int count    = 0;

        /* Solve in 1 pass through values */
        for (int i = 0; i < size; i++) {
            int num = scan.nextInt();
            if (set.contains(num - d) && set.contains(num - 2 * d)) {
                count++;
            }
            set.add(num);
        }
        
        scan.close();
        System.out.println(count);
    }
}
