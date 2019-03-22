// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        long sum = 0; // use long to prevent integer overflow
        for (int i = 0; i < size; i++) {
            sum += scan.nextInt();
        }
        scan.close();
        System.out.println(sum);
    }
}
