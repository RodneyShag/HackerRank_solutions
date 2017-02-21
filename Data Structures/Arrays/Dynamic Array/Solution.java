//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Q = scan.nextInt();
        int lastAns = 0;
        
        /* Create 2-D ArrayList */
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lists.add(new ArrayList<Integer>());
        }
        
        /* Perform Q Queries */
        for (int i = 0; i < Q; i++) {
            int q = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> seq = lists.get((x ^ lastAns) % N);
            if (q == 1) {
                seq.add(y);
            } else if (q == 2) {
                lastAns = seq.get(y % seq.size());
                System.out.println(lastAns);
            }
        }
        
        scan.close();
    }
}
