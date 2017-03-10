//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {     
        /* Read some input */
        Scanner scan = new Scanner(System.in);
        int n = scan .nextInt();
        
        /* Count pairs */
        HashSet<Integer> set = new HashSet<>();
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            int cost = scan.nextInt();
            if (set.contains(cost)) {
                set.remove(cost);
                pairs++;
            } else {
                set.add(cost);
            }
        }

        /* Print output */
        scan.close();
        System.out.println(pairs);
    }
}
