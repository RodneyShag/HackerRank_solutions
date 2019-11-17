// github.com/RodneyShag

import java.util.Scanner;

// For each of the "m" operations, we do not want to take O(n) time to process it. That's because our runtime will end up being O(nm). To get a O(n+m) runtime, we have to process each operation in O(1) time. To do so, we keep track of just the endpoints, which are just 2 numbers, instead of the O(n) numbers in between the endpoints. This is the main idea to decrease our runtime.

// For a value "k", we can mark its left endpoint "a" in the original array, along with its right endpoint "b" in the original array. To distinguish between "a" and "b" we can store "+k" for "a" and "-k" for "b". Now, we technically have stored all information that the "m" operations represent, into an array. Most importantly, we stored it in O(m) time.

// The next step is to actually find the maximum value based off of our unique representation of the data. We traverse our array from left to right. Whenever we reach a left endpoint "a" (which we represented with a positive number), we just add that to our sum. Whenever we reach a right endpoint "b" (which we represented with a negative number), we subtract that from our sum (well, technically we add a negative value). By doing so, the value "sum" represents the value that array[i] would have if we had applied all "m" operations to it. The maximum value of "sum" that we get while traversing the array is the value we return. If this algorithm is still unclear to you, try walking through HackerRank's sample input (Testcase 0) with the code below.

//  Time Complexity: O(n + m)
// Space Complexity: O(n)
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        
        /* Save interval endpoints' "k" values in array */
        long [] array = new long[N + 1];
        while (M-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int k = scan.nextInt();
            array[a-1] += k;
            array[b]   -= k; // see comment at end of code
        }
        scan.close();
        
        /* Find max value */
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            sum += array[i];
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
    }
}

// Regarding the exact values of "a" and "b", it's a little tricky since "a" and "b" are 1-indexed but our array is 0-indexed. So we want to subtract 1 from both "a" and "b". However, for "b" we re-add 1 because we want to change values from "a" to "b" inclusive as stated in the problem, so we want the end of the interval to be 1 to the right of "b" which is why we re-add the 1.

// Discuss on HackerRank: https://www.hackerrank.com/challenges/crush/forum/comments/255515
