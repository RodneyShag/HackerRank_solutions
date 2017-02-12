//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += scan.nextInt();
        }
        System.out.println(sum);
    }
}
