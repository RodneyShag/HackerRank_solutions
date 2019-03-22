// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;

//  Time Complexity: O(n + m)
// Space Complexity: O(1) (other than storing input)
public class Solution {
    public static void main(String[] args) {
        /* Save input - discard duplicates in leaderboard */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int lastScore = -1;
        int[] scores = new int[n];
        int index = 0;
        while (n-- > 0) {
            int currScore = scan.nextInt();
            if (currScore != lastScore) {
                scores[index] = currScore;
                index++;
            }
            lastScore = currScore;
        }
        int m = scan.nextInt();
        int[] alice = new int[m];
        for (int i = 0; i < m; i++) {
            alice[i] = scan.nextInt();
        }
        scan.close();

        /* Print ranks */
        int i = index - 1;
        for (int aliceScore : alice) {
            while (i >= 0) {
                if (aliceScore < scores[i]) {
                    System.out.println(i + 2); // add 2 to get correct rank
                    break;
                }
                i--;
            }
            if (i < 0) { // if true, each remaining aliceScore is highest score
                System.out.println(1);
            }
        }
    }
}
