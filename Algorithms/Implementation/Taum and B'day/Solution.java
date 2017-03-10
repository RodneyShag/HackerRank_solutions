//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            long B = scan.nextLong();
            long W = scan.nextLong();
            long X = scan.nextLong();
            long Y = scan.nextLong();
            long Z = scan.nextLong();
            long priceB = Math.min(X, Y + Z); // conversion price
            long priceW = Math.min(Y, X + Z); // conversion price
            System.out.println(B * priceB + W * priceW);
        }
        scan.close();
    }
}
