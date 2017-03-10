//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

/* Count # of integers (inclusive) between the square roots of A and B */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            int numSquares = (int) (Math.floor(Math.sqrt(B)) - Math.ceil(Math.sqrt(A)) + 1);
            System.out.println(numSquares);
        }
        scan.close();
    }
}
