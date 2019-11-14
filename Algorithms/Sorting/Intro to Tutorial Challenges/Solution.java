// github.com/RodneyShag

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int V = scan.nextInt();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if (scan.nextInt() == V) {
                System.out.println(i);
                break;
            }
        }
        scan.close();
    }
}
