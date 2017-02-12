//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {

    static int solveMeFirst(int a, int b) {
        return a + b;
    }
   
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        /* Calculate sum */
        int sum = solveMeFirst(a, b);

        /* Print output */
        System.out.println(sum);
    }
}
