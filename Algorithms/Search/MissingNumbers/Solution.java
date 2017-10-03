import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrayALen = in.nextInt();
        int[] arrA = new int[arrayALen];
        for (int i = 0; i < arrayALen; i++) {
            arrA[i] = in.nextInt();
        }
        int arrayBLen = in.nextInt();
        int[] arrB = new int[arrayBLen];
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arrayBLen; i++) {
            arrB[i] = in.nextInt();
            if (freq.containsKey(arrB[i])) {
                freq.put(arrB[i], freq.get(arrB[i]) + 1);
            } else {
                freq.put(arrB[i], 1);
            }
        }

        int[] res = new int[arrayBLen - arrayALen];
        for (int i = 0; i < arrayALen; i++) {
            freq.put(arrA[i], freq.get(arrA[i]) - 1);
        }
        int index = 0;
        for (Integer key : freq.keySet()) {
            if (freq.get(key) > 0) {
                res[index++] = key;
            }
        }
        Arrays.sort(res);
        for (int re : res) {
            if (re > 0)
                System.out.print(re + " ");
        }
    }
}