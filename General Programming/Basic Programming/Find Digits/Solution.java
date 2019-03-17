//     Author: Rodney Shaghoulian
//     Github: github.com/RodneyShag
// HackerRank: hackerrank.com/RodneyShag

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int findDigits(int num) {
        int count = 0;
        int n = num;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && num % digit == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    /* HackerRank-provided test code */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int result = findDigits(n);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        scanner.close();
    }
}
