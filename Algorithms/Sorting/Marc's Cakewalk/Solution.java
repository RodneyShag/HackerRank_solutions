// github.com/RodneyShag

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

// Algorithm: Eat the largest cupcakes first

// Is this a Greedy Algorithm? No.
// 
// A greedy algorithm makes the "locally optimal choice at each stage with the hope of finding a 
// global optimum" - Wikipedia. Our solution actually makes the locally LEAST optimal choice at 
// each stage, so it is not a greedy algorithm. Is there a name for this approach? I'm not sure, 
// but maybe we can call it a "reverse-greedy algorithm"

// Time Complexity: O(n log n)
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer [] calories = new Integer[n]; // Use Integer instead of int to make sorting in simpler
        for (int i = 0; i < n; i++){
            calories[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(minimumMiles(calories));
    }
    
    private static long minimumMiles(Integer [] calories) {
        Arrays.sort(calories, Collections.reverseOrder());
        long multiplier = 1;
        long miles = 0;
        for (int j = 0; j < calories.length; j++) {
            miles += calories[j] * multiplier;
            multiplier *= 2;
        }
        return miles;
    }
}
