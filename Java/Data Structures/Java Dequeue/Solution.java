//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashMap;

// O(n) runtime
// O(n) space complexity
public class test {
    public static void main(String[] args) {
        /* Create our data structures */
        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        /* Save first m entries */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for (int i = 0; i < m; i++) {
            int num = scan.nextInt();
            deque.add(num);
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        
        /* Loop through remaining n-m entries */
        int max = map.size();
        for (int i = m; i < n; i++) {
            /* Remove old value */
            int old = deque.remove();
            if (map.get(old) == 1) {
                map.remove(old);
            } else {
                map.put(old, map.get(old) - 1);
            }
            /* Add new value */
            int num = scan.nextInt();
            deque.add(num);
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            
            max = Math.max(max, map.size());
        }
        System.out.println(max);
    }
}
