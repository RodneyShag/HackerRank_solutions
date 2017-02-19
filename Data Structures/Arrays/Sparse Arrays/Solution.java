//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N  = scan.nextInt();
        scan.nextLine(); // gets rid of pesky newline
        HashMap<String, Integer> map  = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            String str = scan.nextLine();
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        
        int Q = scan.nextInt();
        scan.nextLine(); // gets rid of pesky newline
        
        for (int i = 0; i < Q; i++) {
            String str = scan.nextLine();
            if (map.containsKey(str)) {
                System.out.println(map.get(str));
            } else {
                System.out.println(0);
            }
        }
    }
}
