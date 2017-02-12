//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

/* Runtime: O(n log n) due to sorting */
public class Solution {

    public static void main(String[] args) {

        /* Read input: Create and fill array */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        
        /* Sort array: O(n log n) runtime */
        Arrays.sort(array);
        
        /* Calculate Mean */
        int total = 0;
        for (int num : array) {
            total += num;
        }
        double mean = (double) total / size;
        
        /* Calculate Median */
        double median;
        if (size % 2 == 0) {
            median = (array[size / 2 - 1] + array[size / 2]) / 2.0;
        } else {
            median = array[size / 2];
        }
        
        /* Calculate Mode */        
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxOccurrences = 0;
        int mode = Integer.MAX_VALUE;
        
        for (int num : array) {
            /* Update occurrences for this number */
            int occurrences;
            if (map.containsKey(num)) {
                occurrences = map.get(num) + 1;
            } else {
                occurrences = 1;
            }
            map.put(num, occurrences);
            
            /* Update our mode. If there's a tie, choose the smaller number */
            if (occurrences > maxOccurrences) {
                maxOccurrences = occurrences;
                mode = num;
            } else if (occurrences == maxOccurrences && num < mode) { // this does the tie-breaking
                maxOccurrences = occurrences;
                mode = num;
            }
        }

        /* Print results */
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
    }
}
