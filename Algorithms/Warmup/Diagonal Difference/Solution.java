//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

/* O(N^2) runtime. O(1) space */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        int primaryDiagonal   = 0;
        int secondaryDiagonal = 0;
        
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                int value = scan.nextInt();
                if (row == col) {
                    primaryDiagonal += value;
                } 
                if (row + col == N - 1) {
                    secondaryDiagonal += value;
                }
            }
        }
        scan.close();
        
        int absoluteDifference = Math.abs(primaryDiagonal - secondaryDiagonal);
        System.out.println(absoluteDifference);
    }
}
