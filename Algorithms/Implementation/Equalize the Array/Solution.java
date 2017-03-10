//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.Arrays;

// Runtime:          O(n)
// Space Complexity: O(n)
public class Solution {
    
    private static final int size = 100;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] counts = new int[size + 1];
        for (int i = 0; i < n; i++) {
            counts[scan.nextInt()]++;
        }
        scan.close();
        int maxRepetitions = Arrays.stream(counts).max().getAsInt();
        System.out.println(n - maxRepetitions);
    }
}
