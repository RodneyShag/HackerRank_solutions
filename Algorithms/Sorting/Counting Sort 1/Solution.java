// github.com/RodneyShag

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        final int maxValue = 100;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[maxValue];
        
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            array[num]++;
        }
        scan.close();
        
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
