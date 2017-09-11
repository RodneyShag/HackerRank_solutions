//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.HashMap;

// Main trick: Use a HashMap<Integer, Integer> that maps from "value" to "index" 
//             to keep track of of the largest index for each value that we've 
//             seen so far as we loop through array

//  Time Complexity: O(n)
// Space Compleixty: O(n)
public class Solution {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        
        /* Calculate + print result */
        System.out.println(solve(array));
    }
    
    private static int solve(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int prevIndex = map.get(array[i]);
                int currDistance = i - prevIndex;
                minDistance = Math.min(minDistance, currDistance);
            }
            map.put(array[i], i);
        }
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}
