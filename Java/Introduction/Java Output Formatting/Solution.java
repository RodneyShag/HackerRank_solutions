//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("================================");
            for (int i = 0; i < 3; i++) {
                String s1 = scan.next();
                int x = scan.nextInt();
                System.out.format("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");
            scan.close();
    }
}
