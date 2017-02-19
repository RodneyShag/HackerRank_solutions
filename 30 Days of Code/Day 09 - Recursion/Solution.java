//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(factorial(n));
        scan.close();
    }
    
    private static Long factorial (int n) {
        if (n < 0) {
            return null;
        }
        long result = 1;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }
}
