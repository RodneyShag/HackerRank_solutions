// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;
import java.util.Arrays;

//  Time Complexity: O(n)
// Space Complexity: O(n) to save the input. 
//                   You can reduce the space complexity to O(1) by omitting the array and   
//                   working with the input directly, but it will make the code less modular

public class Solution {
    static int cakeCandles(int[] candles) {
        int tallest = 0;
        int count = 0;
        for (int candle : candles) {
            if (candle > tallest) {
                tallest = candle;
                count = 1;
            } else if (tallest == candle) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] candles = new int[n];
        for (int i = 0; i < n; i++) {
            candles[i] = scan.nextInt();
        }
        scan.close();
        
        /* Get num candles blown out */
        int result = cakeCandles(candles);
        System.out.println(result);
    }
}
