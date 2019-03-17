//     Author: Rodney Shaghoulian
//     Github: github.com/RodneyShag
// HackerRank: hackerrank.com/RodneyShag

import java.util.Scanner;
import java.util.HashMap;

// Main trick: Use a HashMap<Integer, Integer> that maps from "value" to "index" 
//             to keep track of the largest index for each value that we've 
//             seen so far as we loop through array

//  Time Complexity: O(n)
// Space Complexity: O(n)

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int prevIndex = map.get(array[i]);
                int currDistance = i - prevIndex;
                minDistance = Math.min(minDistance, currDistance);
            }
            map.put(array[i], i);
        }
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }

    /* HackerRank-provided test code */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        int result = minimumDistances(a);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
