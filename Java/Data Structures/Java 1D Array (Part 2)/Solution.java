//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int testCase = 0; testCase < T; testCase++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            
            /* Create array of values */
            int [] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            
            System.out.println(solvable(array, m, 0) ? "YES" : "NO");
        }
    }
    
    /* Basically a depth-first search (DFS). 
       Marks each array value as 1 when visiting (Side-effect: alters array) */
    private static boolean solvable(int [] array, int m, int i) {
        /* Base Cases */
        if (i < 0 || array[i] == 1) {
            return false;
        } else if (i + 1 >= array.length || i + m >= array.length) {
            return true;
        }
        
        array[i] = 1; // marks as visited

        /* Recursive Cases */
        return solvable(array, m, i - 1) || 
               solvable(array, m, i + 1) || 
               solvable(array, m, i + m);
    }
}
