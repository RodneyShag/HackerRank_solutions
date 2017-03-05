//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

//          Runtime: O(m + n)
// Space Complexity: O(1)
public class Solution {

    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        
        /* Calculate # of apples that fall on house */
        int applesOnHouse = 0;
        for (int i = 0; i < m; i++) {
            int applePosition = a + scan.nextInt();
            if (applePosition >= s && applePosition <= t) {
                applesOnHouse++;
            }
        }
        System.out.println(applesOnHouse);
        
        /* Calculate # of oranges that fall on house */
        int orangesOnHouse = 0;
        for (int i = 0; i < n; i++) {
            int orangePosition = b + scan.nextInt();
            if (orangePosition >= s && orangePosition <= t) {
                orangesOnHouse++;
            }
        }
        System.out.println(orangesOnHouse);
        
        scan.close();
    }
}
