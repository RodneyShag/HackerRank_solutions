// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;

/*

We start off at some random prisoner S and try to distribute M candies. We could just do 
S + M to see which prisoner we end up at. However, we may have more candies than prisoners, 
so we loop back around to the first prisoner by doing the % N where N is number of prisoners.

Each +1 and -1 that you see in the equation is to fix the off-by-one problems that exist 
since prisoners are counted from 1 to N while modular arithmetic is counted from 0.

*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int S = scan.nextInt();
            int last = ((S - 1) + (M - 1)) % N + 1;
            System.out.println(last);
        }
        scan.close();
    }
}
