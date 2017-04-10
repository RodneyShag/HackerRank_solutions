//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

// XOR properties:
//   1) x ^ x = 0
//   2) x ^ 0 = x
    
// We know that a number XORed with itself is 0. Instead of calculating the subarrays directly,
// we calculate the number of times each number appears in any subarray. If it appears an even
// number of times, then (x ^ x ... ^ x) where there is an even number of "x" values will give 0.
// If there are an odd number of "x" values, the result will be "x".
//
//                              *** Case 1: n is even ***
//
// Each element appears an even number of times throughout the subarrays, so the answer is 0.
//
//                              *** Case 2: n is odd ***
//
// We notice that the odd-indexed elements appear an even number of times throughout the 
// subarrays, so xoring them together will give 0, so we can ignore the odd-indexed elements.
//
// The even-indexed elements in the original subarray will appear an odd number of times
// throughout the subarrays. We can go ahead and XOR the values of the even-indexed elements
// in the original array to get our final answer.

//  Time Complexity: O(n)

public class Solution {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int n = scan.nextInt();
            int [] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scan.nextInt();
            }
            if (n % 2 == 0) { // Case 1
                System.out.println(0);
            } else { // Case 2
                int result = 0;
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        result ^= array[i];
                    }
                }
                System.out.println(result);
            }
        }
        scan.close();
    }
}
