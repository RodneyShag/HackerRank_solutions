//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

//          Runtime: O(n)     
// Space Complexity: O(1)
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            long num = scan.nextLong();
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        scan.close();
        System.out.print((sum - max) + " " + (sum - min));
    }
}
