// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            System.out.println(solve(x, y, z));
        }
        scan.close();
    }
    
    private static String solve(int x, int y, int z) {
        int A_to_C = Math.abs(z - x);
        int B_to_C = Math.abs(z - y);
        if (A_to_C < B_to_C) {
            return "Cat A";
        } else if (A_to_C > B_to_C) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }
}
