// github.com/RodneyShag

import java.util.Scanner;

/*

 Time Complexity: O(n) with just 1 traversal of our String
Space Complexity: O(1)

There are approximately 26^2 possible combinations of alternating pairs of letters. 
Notice that this number remains constant and is not dependent on the length of our 
input String. This fact will help us achieve a linear O(n) runtime.

We want to solve this problem with just 1 traversal of our String, so we solve all 
26^2 subproblems simultaneously. We use two int[26][26] arrays to keep track of the 
26^2 solutions.

As we iterate through our String, we update our two int[26][26] arrays as follows:
- int[26][26] letter ---> This array is used to keep track of which of the alternating 
  characters we saw last. To achieve this, for the current character "ch", we update the 
  corresponding row (26 entries) and column (26 entries) with the (ASCII) value of "ch".
- int[26][26] count ----> if we find that no solution exists for a pair of characters 
  (which happens when the characters don't alternate), we store -1 in this array.
  Otherwise, we store he current maximum length of "s" for the pair of characters.

Our final answer is the maximum value in our "int[26][26] count" array.

*/

public class Solution {
    
    public static final int NUM_LETTERS = 26;
    
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        String str = scan.next();
        scan.close();
        
        /* Edge case */
        if (length <= 1) {
            System.out.println(0);
            return;
        }
        
        /* Create arrays representing the 26^2 subproblems */
        int [][] pair  = new int[NUM_LETTERS][NUM_LETTERS];
        int [][] count = new int[NUM_LETTERS][NUM_LETTERS];
        
        for (int i = 0; i < length; i++) {
            char letter   = str.charAt(i);
            int letterNum = letter - 'a';
            
            /* Update row */
            for (int col = 0; col < NUM_LETTERS; col++) {
                if (pair[letterNum][col] == letter) {
                    count[letterNum][col] = -1;
                }
                if (count[letterNum][col] != -1) {
                    pair[letterNum][col] = letter;
                    count[letterNum][col]++;
                }
            }
            
            /* Update column */
            for (int row = 0; row < NUM_LETTERS; row++) {
                if (pair[row][letterNum] == letter) {
                    count[row][letterNum] = -1;
                }
                if (count[row][letterNum] != -1) {
                    pair[row][letterNum] = letter;
                    count[row][letterNum]++;
                }
            }
        }
        
        /* Find max in "count" array */
        int max = 0;
        for (int row = 0; row < NUM_LETTERS; row++) {
            for (int col = 0; col < NUM_LETTERS; col++) {
                max = Math.max(max, count[row][col]);
            }
        }
        System.out.println(max);
    }
}
