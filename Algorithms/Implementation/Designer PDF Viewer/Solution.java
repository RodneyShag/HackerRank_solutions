//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    
    private static final int letters = 26;
    
    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        int [] height = new int[letters];
        for (int i = 0; i < letters; i++){
            height[i] = scan.nextInt();
        }
        String str = scan.next();
        scan.close();
        
        /* Calculate and print area */
        int maxHeight = 0;
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            maxHeight = Math.max(maxHeight, height[index]);
        }
        int area = maxHeight * str.length();
        System.out.println(area);
    }
}
