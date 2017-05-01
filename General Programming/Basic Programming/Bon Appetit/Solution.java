//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

// Although imprecise, this problem is intended to be solved using an "int" instead of a "double" to store dollar amounts.
public class Solution {
    public static void main(String[] args) {
        /* Read input and calcute chargedBill and actualBill */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int actualBill = 0;
        for (int i = 0; i < n; i++) {
            int price = scan.nextInt();
            if (i != k) {
                actualBill += price;
            }
        }
        actualBill *= 0.5;
        int chargedBill = scan.nextInt();

        /* Print output */
        if (chargedBill == actualBill) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(chargedBill - actualBill);
        }
    }
}
