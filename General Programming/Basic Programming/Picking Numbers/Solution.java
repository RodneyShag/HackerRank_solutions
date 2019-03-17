//     Author: Rodney Shaghoulian
//     Github: github.com/RodneyShag
// HackerRank: hackerrank.com/RodneyShag

// Algorithm: 
//  1 - Notice there is a special restriction on the range of values in the array: values are between 0 and 100.
//  2 - Since the order of elements in our array does not matter, we can just keep the counts of each number.
//  3 - Create a new 100-element "counts" array to store the counts of each number.
//  4 - In our "counts" array, the adjacent pair with the largest sum is our final solution.
//  5 - This is because the original numbers represented by the 2 adjacent slots in counts[] can be used to create a 
//      maximal solution

// Time complexity: O(n)

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    static final int MAX_VALUE = 100;

    public static int pickingNumbers(List<Integer> array) {
        /* Save counts of each number */
        int[] counts = new int[MAX_VALUE];
        for (int num : array) {
            counts[num]++;
        }
        
        /* Find adjacent pair with largest sum */
        int max = 2;
        for (int i = 1; i < 100; i++) {
            int adjacentSum = counts[i] + counts[i-1];
            max = Math.max(max, adjacentSum);
        }
        return max;
    }
}

/* HackerRank-provided test code */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        int result = Result.pickingNumbers(a);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
