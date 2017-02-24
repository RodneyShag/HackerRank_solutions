//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent  = scan.nextInt();    // tip percentage
        int taxPercent  = scan.nextInt();    // tax percentage
        scan.close();

        /* Calculate total cost */
        int totalCost = (int) Math.round(mealCost + 
                                         mealCost * tipPercent / 100.0 + 
                                         mealCost * taxPercent / 100.0);
        
        /* Print output */
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
