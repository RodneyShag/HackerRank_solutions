//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

// - Our input provides us "n" values of x and p(x)
// - p(x) is a 1-to-1 function, so it has an inverse. 
// - We create the function representing the inverse of p(x), and represent it as an array: int [] p_inverse 
// - We need find a y where p(p(y)) = x. This equation can be rewritten as y = p_inverse(p_inverse(x)), which is the version of the equation we use to calculate and print "y".

public class Solution {
    public static void main(String [] args) {
        /* Create function: p_inverse */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] p_inverse = new int[n + 1];
        for (int x = 1; x <= n; x++) {
            int px = scan.nextInt();
            p_inverse[px] = x;
        }
        scan.close();
        
        /* Calculate and print each y */
        for (int x = 1; x <= n; x++) {
            int y = p_inverse[p_inverse[x]];
            System.out.println(y);
        }
    }
}
