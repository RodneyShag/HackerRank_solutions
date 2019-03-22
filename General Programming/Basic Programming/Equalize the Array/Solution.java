// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;
import java.util.Arrays;

//  Time Complexity: O(a + n)
// Space Complexity: O(a)
public class Solution {
    
    private static final int size = 100;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] counts = new int[size + 1]; // could alternatively use a HashMap
        for (int i = 0; i < n; i++) {
            counts[scan.nextInt()]++;
        }
        scan.close();
        int maxRepetitions = Arrays.stream(counts).max().getAsInt();
        System.out.println(n - maxRepetitions);
    }
}
