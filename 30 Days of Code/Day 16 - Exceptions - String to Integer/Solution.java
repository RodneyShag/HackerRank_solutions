// github.com/RodneyShag

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
