//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

/*

if (a == b), the last stone can have only 1 value, which is (n - 1) * a

if (a != b), we notice that 2 consecutive stones can have a difference of "a" or "b". In a path, there are n-1 differences representing pairs of adjacent stones. We are not interested in where in the path the difference between 2 stones is "a" or "b", since changing the order of where the differences occur still results in the same value for the last stone. What's important is the # of times the difference between 2 stones is "a" and the # of times it's "b". For a >= 0 and b >= 0, there are n-1 ways to choose "a" and "b" such that a + b == n-1, so there are n-1 possibilities for the last stone.

To print the n-1 possible values for the last stone, we iterate through the n-1 combinations of "a" and b" and calculate the value of the last stone for each combination.

*/

//  Time complexity: O(n)
// Space complexity: O(1)
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int n = scan.nextInt();
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == b) {
                System.out.print((n - 1) * a);
            } else {
                if (a > b) { // swap to make "a" the smaller value.
                    int temp = a;
                    a = b;
                    b = temp;
                }
                for (int i = 0; i <= n - 1; i++) {
                    System.out.print(a*(n-1-i) + b*i + " ");
                }
            }
            System.out.println();
        }
    }
}
