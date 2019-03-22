// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;

// Time complexity: O(n)
public class Solution {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scan.nextInt();
        }
        scan.close();
        
        /* Calculate answer */
        printRecords(scores);
    }
    
    static void printRecords(int[] scores){
        int min = scores[0];
        int max = scores[0];
        int higherScore = 0;
        int lowerScore = 0;
        for (int score: scores) {
            if (score > max) {
                max = score;
                higherScore++;
            }
            if (score < min) {
                min = score;
                lowerScore++;
            } 
        }
        System.out.print(higherScore + " " + lowerScore);
    }
}
