//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
    private int[] elements;
    public int maximumDifference;
    
    Difference (int [] elements) {
        this.elements = elements;
    }

    // O(n) runtime. O(1) space
    void computeDifference() {
        maximumDifference = 0;
        int min = elements[0];
        int max = elements[0];
        for (int num : elements) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        maximumDifference = max - min;
    }
} // End of Difference class

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
