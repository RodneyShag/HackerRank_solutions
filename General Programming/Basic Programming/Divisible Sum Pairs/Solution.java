//     Author: Rodney Shaghoulian
//     Github: github.com/RodneyShag
// HackerRank: hackerrank.com/RodneyShag

/*

 Time Complexity: O(n + k)
Space Complexity: O(k)

We keep track of the mod values in buckets for each number we read. We can do this 
by creating k buckets where bucket "i" counts each number "n" where n % k = i.

Notice that each bucket has a corresponding "complement" bucket. That is, if we take 
the mod value of one bucket and add it to the mod value of another bucket, we get "k".

Bucket   Complement Bucket
------   -----------------
   0            0
   1           k-1
   2           k-2
   3           k-3
        ...
  k-3           3
  k-2           2
  k-1           1

As we come across each number, we find its corresponding complement bucket. Each number in 
this complement bucket can be paired with our original number to create a sum divisible by *k*

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int [] bucket = new int[k];
        int count = 0;
        for (int value : ar) {
            int modValue = value % k;
            count += bucket[(k - modValue) % k]; // adds # of elements in complement bucket.
            bucket[modValue]++;                  // saves in bucket.
        }
        return count;
    }

    /* HackerRank-provided test code */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] nk = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] ar = new int[n];
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }
        int result = divisibleSumPairs(n, k, ar);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}
