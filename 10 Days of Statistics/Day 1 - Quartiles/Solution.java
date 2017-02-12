//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    
    public static void main(String[] args) {
        int [] array = getValues();
        Arrays.sort(array);
        
        /* Works with both even and odd length arrays */
        int q1 = findMedian(array, 0, array.length / 2 - 1);
        int q2 = findMedian(array, 0, array.length - 1);
        int q3 = findMedian(array, (array.length + 1) / 2, array.length - 1);
        
        /* Print output */
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }

    /* Treats elements from "start" to "end" as an array and calculates its median */
    private static int findMedian(int [] array, int start, int end) {
        if ((end - start) % 2 == 0) { // odd number of elements
            return (array[(end + start) / 2]);
        } else { // even number of elements
            int value1 = array[(end + start) / 2];
            int value2 = array[(end + start) / 2 + 1];
            return Math.round((value1 + value2) / 2); 
        }
    }
    
    /* Creates array from input */
    private static int [] getValues() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        return array;
    }
}
