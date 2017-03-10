//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        scan.close();
        int count = 0;
        for (int num = i; num <= j; num++) {
            if (Math.abs(num - reverse(num)) % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    private static int reverse(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}
