// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        /* Print staircase */
        for (int spaces = n - 1; spaces >= 0; spaces--) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            for (int i = spaces; i < n; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}