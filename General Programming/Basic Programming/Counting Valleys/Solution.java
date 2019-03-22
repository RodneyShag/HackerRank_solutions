// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;

// Idea: Keep track of your "level", which is how far above or below sea level you are.
//       If you ever take a step up to sea level, you just completed walking through a valley.

// Time Complexity: O(n)
public class Solution {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        scan.nextLine();              // gets rid of 1st line
        String str = scan.nextLine(); // String is of size "n"
        scan.close();
        
        System.out.println(countValleys(str));
    }
    
    private static int countValleys(String str) {
        int level = 0;
        int numValleys = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'U') {
                level++;
                if (level == 0) {
                    numValleys++; // since we just stepped up to sea level
                }
            } else if (ch == 'D') {
                level--;
            }
        }
        return numValleys;
    }
}
