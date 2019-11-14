// github.com/RodneyShag

import java.util.Scanner;
import java.util.Arrays;

// Algorithm: Sort the array and compare adjacent pairs

// Greedy algorithm? No

// A greedy algorithm makes "the locally optimal choice at each 
// stage with the hope of finding a global optimum" - Wikipedia

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(minAbsoluteDifference(array));
    }
    
    private static int minAbsoluteDifference(int [] array) {
        Arrays.sort(array);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, Math.abs(array[i] - array[i-1]));
        }
        return min;
    }
}
