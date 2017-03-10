//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] cloud = new int[n];
        for (int i = 0; i < n; i++) {
            cloud[i] = scan.nextInt();
        }
        scan.close();
        
        /* Jump on clouds */
        int jumps = 0;
        int i     = 0;
        while (i < n - 1) {
            if (i + 2 < n && cloud[i + 2] == 0) {
                i += 2;
            } else {
                i++;
            }
            jumps++;
        }
        System.out.println(jumps);
    }
}
