// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;
import java.util.Arrays;

//  Time Complexity: O(n)
// Space Complexity: O(1) by doing an "in place" rotation
public class Solution {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int size     = scan.nextInt();
        int k        = scan.nextInt();
        int q        = scan.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        
        /* Rotate array (in place) using 3 reverse operations */
        k %= size; // to account for k > size
        reverse(array, 0, array.length - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, array.length - 1);
        
        /* Print output */
        while (q-- > 0) {
            int m = scan.nextInt();
            System.out.println(array[m]);
        }
        scan.close();
    }
    
    /* Reverses array from "start" to "end" inclusive */
    private static void reverse(int[] array, int start, int end) {
        if (array == null || start < 0 || start >= array.length || end < 0 || end >= array.length) {
            return;
        }
        while (start < end) {
            swap(array, start++, end--);
        }
    }
    
    private static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
