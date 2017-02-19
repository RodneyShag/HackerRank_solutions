//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int multiplier = scan.nextInt();
        scan.close();
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d%n", multiplier, i , i * multiplier);
        }
    }
}
