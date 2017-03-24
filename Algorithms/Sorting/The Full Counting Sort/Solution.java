//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;

// Performance Improvements:
//     - used BufferedReader instead of Scanner: https://www.hackerrank.com/challenges/countingsort4/forum/comments/223339
//     - used StringBuffer to do 1 output to console instead of multiple outputs

public class Solution {
    public static void main(String[] args) throws IOException {
        final int maxValue = 100;
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();
        
        /* Save input */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] pair = br.readLine().split(" ");
            int key       = Integer.parseInt(pair[0]);
            String value  = (i < n/2) ? "-" : pair[1];
            
            ArrayList<String> list = map.get(key);
            if (list == null) {
                list = new ArrayList<String>();
                map.put(key, list);
            }
            list.add(value);
        }
        br.close();
        
        /* Print output */
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < map.size(); i++) {
            ArrayList<String> values = map.get(i);
            for (String str : values) {
                sb.append(str + " ");
            }
        }
        System.out.println(sb);
    }
}
