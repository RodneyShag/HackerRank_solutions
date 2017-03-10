//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        long n     = scan.nextLong();
        scan.close();
        
        /* Found out # of times 'a' appears in our String */
        int wordAs = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                wordAs++;
            }
        }
        long completeWords    = n / str.length();
        long remainingLetters =  n % str.length();
        long totalAs = completeWords * wordAs;
        
        for (int i = 0; i < remainingLetters; i++) {
            if (str.charAt(i) == 'a') {
                totalAs++;
            }
        }
        System.out.println(totalAs);
    }
}
