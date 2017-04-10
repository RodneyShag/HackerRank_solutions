//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

// Each time we have 2 consecutive characters that are the same, we can delete 1 of them

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            String str = scan.next();
            System.out.println(minimumDeletions(str));
        }
        scan.close();
    }
    
    private static int minimumDeletions(String str) {
        int deletions = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                deletions++;
            }
        }
        return deletions;
    }
}
