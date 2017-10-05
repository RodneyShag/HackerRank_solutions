import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        long[] input = new long[n];
        for (int i = 0; i < n; i++) {
            input[i] = in.nextLong();
        }
        Arrays.sort(input);
        int pairCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (binarySearch(input[i] + k, input, i + 1, n - 1) != -1) {
                pairCount++;
            }
        }
        System.out.println(pairCount);
    }
    
    public static int binarySearch(long ele, long[] arr, int start, int end) {
        while(start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == ele) {
                return mid;
            } else if (arr[mid] < ele) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
