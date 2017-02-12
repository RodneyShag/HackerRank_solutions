//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.Arrays;

/* We basically implement MergeSort and 
    1) Add "swaps" counter and 1 line of code to count swaps when merging
    2) Use "long" instead of "int" to avoid integer overflow
    
    Runtime: O(n log n)
    Space Complexity: O(n)
*/
public class Solution {

    private static class MergeSort {
        /* Our array has up to n = 100,000 elements. That means there may be O(n^2) swaps. 
           n^2 is 10,000,000,000. A Java int has max value 2,147,483,647 so we use a long 
           to avoid integer overflow */
        private long swaps = 0;
    
        public long mergeSort(int [] array) {
            int [] helper = new int[array.length];
            mergeSort(array, helper, 0, array.length - 1);
            return swaps;
        }

        private void mergeSort(int [] array, int [] helper, int start, int end) {
            if (start < end) {
                int mid = (start + end) / 2;
                mergeSort(array, helper, start, mid);
                mergeSort(array, helper, mid + 1, end);
                merge(array, helper, start, mid, end);
            }
        }

        private void merge(int [] array, int [] helper, int start, int mid, int end) { 

            /* Fill helper array with same elements as original array */
            for (int i = start; i <= end; i++) { // notice "i" goes from "start" to "end", not "0" to "array.length"
                helper[i] = array[i];
            }

            int curr  = start;
            int left  = start;
            int right = mid + 1;

            /* Loop through helper[] left and right halves and continuously copy smaller element to array[] */
            while (left <= mid && right <= end) {
                if (helper[left] <= helper[right]) {
                    array[curr++] = helper[left++];
                } else {
                    /* Each time we choose element from right side, we count up how many elements
                       it is less than from left side. This is equivalent to counting swaps. */
                    swaps += mid + 1 - left;
                    array[curr++] = helper[right++];
                }
            }

            /* Copy remaining elements of left half. Right half elements are already in proper place */
            while (left <= mid) {
                array[curr++] = helper[left++];
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = scan.nextInt();
            int arr[] = new int[n];
            for (int arr_i=0; arr_i < n; arr_i++) {
                arr[arr_i] = scan.nextInt();
            }
            
            MergeSort ms = new MergeSort();
            System.out.println(ms.mergeSort(arr));
        }
        scan.close();
    }
}
