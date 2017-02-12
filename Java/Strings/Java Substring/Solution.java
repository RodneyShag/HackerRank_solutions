//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        String s  = scan.next();
        int start = scan.nextInt();
        int end   = scan.nextInt();
        scan.close();
        
        System.out.println(s.substring(start, end));
    }
}
