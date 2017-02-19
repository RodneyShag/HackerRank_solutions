//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.HashMap;

class Solution {
    public static void main(String [] args) {
        /* Read input and save as entries in a HashMap */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String name = scan.next();
            int phone   = scan.nextInt();
            map.put(name, phone);
        }
        
        /* Read each query and check if its in our HashMap */
        while(scan.hasNext()) {
            String s = scan.next();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        
        scan.close();
    }
}
