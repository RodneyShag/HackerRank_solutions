//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int onTimeStudents = 0;
            int N = scan.nextInt();
            int K = scan.nextInt();
            for (int i = 0; i < N; i++) {
                if (scan.nextInt() <= 0) {
                    onTimeStudents++;
                }
            }
            System.out.println(onTimeStudents < K ? "YES" : "NO");
        }
        scan.close();
    }
}
