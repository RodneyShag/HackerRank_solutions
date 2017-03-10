//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

// Case 1: See if we can completely erase String "s" and append String "t". If we need to waste operations to reach "k" operations, we can do so when String "s" has no characters.

// Case 2: See if we can convert String "s" to String "t" without completely erasing String "s". We keep erasing charcters from String "s" until it becomes a prefix of String "t". We then add the characters needed to turn String "s" into String "t". If we need to waste operations to reach "k" operations, we can only do so in groups of 2 by doing an append and a delete.

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(canConvert(s, t, k) ? "Yes" : "No");
    }    

    private static boolean canConvert(String s, String t, int k) {
        /* Case 1 */
        if (s.length() + t.length() <= k) {
            return true;
        }
        
        /* Case 2 */
        int i = 0; // represents index of 1st non-matching character
        for (   ; i < s.length() && i < t.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                break;
            }
        }
        int minOperations = (s.length() - i) + (t.length() - i);
        return k >= minOperations && (k - minOperations) % 2 == 0;
    }
}
