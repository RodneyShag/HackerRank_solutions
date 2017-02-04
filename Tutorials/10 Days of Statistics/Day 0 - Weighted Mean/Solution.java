import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        /* Read and save data */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] elements = new int[size];
        int [] weights  = new int[size];
        for (int i = 0; i < size; i++) {
            elements[i] = scan.nextInt();
        }
        scan.nextLine(); // just to be safe, gets rid of the newline.
        for (int i = 0; i < size; i++) {
            weights[i] = scan.nextInt();
        } 
        
        /* Calculate weighted mean */
        int total = 0;
        int totalWeights = 0;
        for (int i = 0; i < size; i++){
            total += elements[i] * weights[i];
            totalWeights += weights[i];
        }
        
        double weightedMean = (double) total / totalWeights;
        System.out.format("%.1f", weightedMean);
    }
}
