//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        String str = scan.next();
        int K      = scan.nextInt();
        scan.close();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            sb.append(encrypt(ch, K));
        }
        
        System.out.println(sb);
    }
    
    /* Encrypts a character using Caesar Cipher */
    private static char encrypt(char ch, int K) {
        if (!Character.isLetter(ch)) {
            return ch;
        }
        char base = Character.isLowerCase(ch) ? 'a' : 'A';
        return (char) ((ch - base + K) % 26 + base);
    }
}
