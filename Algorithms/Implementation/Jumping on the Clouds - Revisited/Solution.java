//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int E = 100;
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int cloud[] = new int[n];
        for (int i = 0; i < n; i++) {
            cloud[i] = scan.nextInt();
        }
        scan.close();

        /* Jump on clouds */
        int position = 0;
        do {
            position = (position + k) % n;
            if (cloud[position] == 1) {
                E -= 2;
            }
            E--;
        } while (position != 0);
        System.out.println(E);
    }
}
