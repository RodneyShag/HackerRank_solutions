//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.Arrays;

/*           Runtime: O(n)     
    Space Complexity: O(1) by doing an "in place" rotation
*/
public class Solution {
    public static void main(String[] args) {
        /* Read input and create array */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        
        /* Rotate array (in place) using 3 reverse operations */
        k = k % n; // to account for cases where k > n
        reverse(array, 0, array.length - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, array.length - 1);
        
        /* Print output */
        for (int i = 0; i < q; i++) {
            int m = scan.nextInt();
            System.out.println(array[m]);
        }
        scan.close();
    }
    
    /* Reverses array from "start" to "end" inclusive */
    private static void reverse(int [] array, int start, int end) {
        if (array == null || start < 0 || start >= array.length || 
            end < 0 || end >= array.length || start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        for (int i = start; i <= mid; i++) {
            int offset = i - start;
            swap(array, start + offset, end - offset);
        }
    }

    private static void swap (int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
