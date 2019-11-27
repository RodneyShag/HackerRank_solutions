// github.com/RodneyShag

import java.util.Scanner;
import java.util.HashMap;

// Recursive solution using dynamic programming 

//  Time Complexity: O(n)
// Space Complexity: O(n)

// Can alternatively be solved in O(1) space (per testcase) by using iteration instead of recursion
    
public class Solution {
    private static HashMap<Integer, Integer> cache = new HashMap();
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        cache.put(0, 1); // base case
        while (testcases-- > 0) {
            int n = scan.nextInt();
            System.out.println(staircase(n));
        }
        scan.close();
    }
    
    private static int staircase(int n) {
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
