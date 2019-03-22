// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            String str = scan.next();
            System.out.println(subsequenceExists(str) ? "YES" : "NO");
        }
        scan.close();
    }
    
    private static boolean subsequenceExists(String str) {
        String hackerrank = "hackerrank";
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == hackerrank.charAt(index)) {
                index++;
            }
            if (index == hackerrank.length()) {
                return true;
            }
        }
        return false;
    }
}
