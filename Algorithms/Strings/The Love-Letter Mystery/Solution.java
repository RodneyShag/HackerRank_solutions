//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

// We compare ASCII values for pairs of characters. The 1st pair we consider is the 2 
// characters at opposite ends of the String. We then move inwards until we consider
// all palindromic pairs.

public class Solution {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            String str = scan.next();
            System.out.println(minimumOperations(str));
        }
        scan.close();
    }
    
    private static int minimumOperations(String str) {
        int count = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            count += Math.abs(str.charAt(i) - str.charAt(str.length() - 1 - i));
        }
        return count;
    }
}
