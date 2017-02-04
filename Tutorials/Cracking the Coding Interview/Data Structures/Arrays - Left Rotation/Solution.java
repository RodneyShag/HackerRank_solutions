import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        // Rodney code below

        /* Create new array with rotated elements */
        int rotatedArray[] = new int[n];
        for (int i = 0; i < n; i++){
            rotatedArray[i] = a[(i + k) % n]; // we start at an offset of "k"
        }
        
        /* Print rotated array */
        for (int i = 0; i < n; i++){
            System.out.print(rotatedArray[i] + " ");
        }
    }
}
