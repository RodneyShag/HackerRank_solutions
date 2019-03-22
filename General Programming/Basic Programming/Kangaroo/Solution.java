// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;

// Case 1: v1 <= v2
// In this case, kangaroo 1 can never catch up to kangaroo 2

// Case2 : v1 > v2
// x2 - x1 represents the distance between the 2 kangaroos
// v2 - v1 represents the difference in velocities between the 2 kangaroos. It also represents how much closer the kangaroos get in each step (until they either meet or 1 kangaroo jumps over the other)
// If the distance between the kangaroos (x2 - x1) is divisible by how much closer they get in each step (v2 - v1), then they will land at the same location at the same time. Otherwise, 1 kangaroo will jump over the other and they will never be at the same location at the same time.

public class Solution {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int v1 = scan.nextInt();
        int x2 = scan.nextInt();
        int v2 = scan.nextInt();
        scan.close();
        
        /* See if kangaroos meet each other */
        if (v1 <= v2) {
            System.out.println("NO");
        } else {
            boolean kangaroosMeet = (x2 - x1) % (v2 - v1) == 0;
            System.out.println(kangaroosMeet ? "YES" : "NO");
        }
    }
}
