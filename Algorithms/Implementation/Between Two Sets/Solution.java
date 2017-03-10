//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int [] arrayA = new int[n];
        for (int i = 0; i < n; i++) {
            arrayA[i] = scan.nextInt();
        }
        int [] arrayB = new int[m];
        for (int i = 0; i < m; i++) {
            arrayB[i] = scan.nextInt();
        }
        scan.close();
        
        /* Find LCM of arrayA. Find GCD of arrayB */
        int A_LCM = lcm(arrayA);
        int B_GCD = gcd(arrayB);
        
        /* Calculate # of integers "between" arrayA and arrayB */
        int count = (B_GCD % A_LCM == 0) ? numDivisors(B_GCD / A_LCM) : 0;
        System.out.println(count);
    }
    
    private static int gcd(int a, int b) { // Euclid's GCD Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    /* Uses Java 8 streams for better parallelization of code */
    private static int gcd(int [] array) {
        return Arrays.stream(array).reduce(array[0], (a, b) -> gcd(a, b));
    }

    /* Uses Java 8 streams for better parallelization of code */
    private static int lcm(int [] array) {
        return Arrays.stream(array).reduce(array[0], (a, b) -> lcm(a, b));
    }
    
    private static int numDivisors(int n) {
        int count = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) { // if "i" is a divisor
                count += 2;   // account for both divisors
            }
        }
        /* If sqrt is a divisor, we should only count it once */
        if (sqrt * sqrt == n) {
            count--;
        }
        return count;
    }
}
