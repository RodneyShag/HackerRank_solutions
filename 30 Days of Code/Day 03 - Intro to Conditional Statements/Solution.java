
// github.com/RodneyShag

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read input */
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        
        /* Determine answer */
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            if (n >= 6 && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }
        }
        
        /* Print output */
        System.out.println(ans);
    }
}
