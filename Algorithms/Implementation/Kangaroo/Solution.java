//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int v1 = scan.nextInt();
        int x2 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        
        /* See if kangaroos meet each other */
        if (v1 <= v2) {
            System.out.println("NO");
        } else {
            boolean kangaroosMeet = (x2 - x1) % (v2 - v1) == 0;
            System.out.println(kangaroosMeet ? "YES" : "NO");
        }
    }
}
