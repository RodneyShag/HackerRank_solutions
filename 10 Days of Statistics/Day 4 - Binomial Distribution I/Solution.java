//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

public class Solution {

    public static void main(String[] args) {
        double ratio = 1.09;
        
        double p = ratio / (1 + ratio);
        int    n = 6;
        
        /* Calculate result */
        double result = 0;
        for (int x = 3; x <= n; x++) {
            result += binomial(n, x, p);
        }
        System.out.format("%.3f", result);
    }
    
    private static Double binomial(int n, int x, double p) {
        if (p < 0 || p > 1 || n < 0 || x < 0 || x > n) {
            return null;
        }
        return combinations(n, x) * Math.pow(p, x) * Math.pow(1 - p, n - x);
    }
    
    private static Long combinations(int n, int x) {
        if (n < 0 || x < 0 || x > n) {
            return null;
        }
        return factorial(n) / (factorial(x) * factorial(n - x));
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
