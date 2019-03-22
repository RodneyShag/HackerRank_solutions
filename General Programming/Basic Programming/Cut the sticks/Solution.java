// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        /* Save Input */
        Scanner scan = new Scanner(System.in);
        int numSticks = scan.nextInt();
        int [] array = new int[numSticks];
        for (int i = 0; i < numSticks; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        
        Arrays.sort(array);
        
        System.out.println(array.length);
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i-1]) {
                System.out.println(array.length - i);
            }
        }
    }
}
