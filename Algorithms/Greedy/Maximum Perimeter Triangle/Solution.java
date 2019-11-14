// github.com/RodneyShag

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

//  Time complexity: O(n log n)
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Integer [] stick = new Integer[N];
        for (int i = 0; i < N; i++) {
            stick[i] = scan.nextInt();
        }
        scan.close();        
        findTriangle(stick);
    }
    
    /* Greedy Approach: Try to use the biggest sticks first */
    private static void findTriangle(Integer [] stick) {
        Arrays.sort(stick, Collections.reverseOrder());
        for (int i = 0; i < stick.length - 2; i++) {
            if (stick[i] < stick[i+1] + stick[i+2]) {
                System.out.println(stick[i+2] + " " + stick[i+1] + " " + stick[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}
