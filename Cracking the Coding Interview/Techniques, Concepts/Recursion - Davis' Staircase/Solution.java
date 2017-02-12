//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.HashMap;

/* Recursive solution using dynamic programming */
public class Solution {
    
    private static HashMap<Integer, Integer> cache = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();

        cache.put(0, 1); // base case
        for (int a0 = 0; a0 < s; a0++) {
            int n = scan.nextInt();
            System.out.println(staircase(n));
        }
        scan.close();
    }
    
    public static int staircase(int n) {
        if (n < 0) {
            return 0;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int ways = staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
        cache.put(n, ways);
        return ways;
    }
}
