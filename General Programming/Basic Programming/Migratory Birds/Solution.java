// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;

// Time Complexity: O(n)
public class Solution {
    
    static final int NUM_TYPES = 5;
    
    static int migratoryBirds(int[] birds) {
        /* Get counts of each type */
        int[] count = new int[NUM_TYPES + 1];
        for (int num : birds) {
            count[num]++;
        }
        
        /* Find max */
        int maxIndex = 1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] birds = new int[n];
        for (int i = 0; i < n; i++){
            birds[i] = scan.nextInt();
        }
        scan.close();
        
        /* Calculate result */
        int result = migratoryBirds(birds);
        System.out.println(result);
    }
}
