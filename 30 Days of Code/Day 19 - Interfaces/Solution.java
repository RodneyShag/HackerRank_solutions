// github.com/RodneyShag

import java.io.*;
import java.util.*;

interface AdvancedArithmetic {
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    //          Runtime: O(n^(1/2))
    // Space Complexity: O(1)
    public int divisorSum(int n) {
        int sum = 0;
        int sqrt = (int) Math.sqrt(n);

        // Small optimization: if n is odd, we can't have even numbers as divisors
        int stepSize = (n % 2 == 1) ? 2 : 1;

        for (int i = 1; i <= sqrt; i += stepSize) {
            if (n % i == 0) { // if "i" is a divisor
                sum += i + n/i; // add both divisors
            }
        }

        // If sqrt is a divisor, we should only count it once
        if (sqrt * sqrt == n) {
            sum -= sqrt;
        }
        return sum;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
