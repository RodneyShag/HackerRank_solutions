// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;

// Idea: Use a "sliding window" of "m" squares. Each time we add a square to the right, remove one from the left.

//  Time Complexity: O(n)
// Space Complexity: O(1) (other than saving input)
public class Solution {
    static int solve(int n, int[] square, int d, int m) {        
        int sum = 0;
        int numWays = 0;
        
        /* Test first set of "m" chocolates */
        for (int i = 0; i < m; i++) {
            sum += square[i];
        }
        if (sum == d) {
            numWays++;
        }
        
        /* Test remaining sets of "m" chocolates */
        for (int i = m; i < square.length; i++) {
            sum += square[i] - square[i-m]; // add chocolate, remove chocolate
            if (sum == d) {
                numWays++;
            }
        }
        
        return numWays;
    }

    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] square = new int[n];
        for (int i = 0; i < n; i++) {
            square[i] = scan.nextInt();
        }
        int d = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        
        /* Calculate result */
        int result = solve(n, square, d, m);
        System.out.println(result);
    }
}

