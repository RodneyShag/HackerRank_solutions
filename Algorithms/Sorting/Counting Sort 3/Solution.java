// github.com/RodneyShag

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        final int maxValue = 100;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[maxValue];
        
        /* Save into buckets */
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            scan.next(); // don't need the String
            array[num]++;
        }
        scan.close();
        
        /* Print "L" for each bucket */
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i];
            System.out.print(count + " ");
        }
    }
}
