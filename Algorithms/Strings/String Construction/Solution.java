// github.com/RodneyShag

import java.util.Scanner;

// Idea:
//  - Once a letter is in "p", we no longer have to copy it from "s" to "p". We can 
//    use Rule #2 to append it to "p" at no charge
//  - To get our final answer, we count the number of distinct characters in "s"

public class Solution {
    static long stringConstruction(String s) {
        return s.chars().distinct().count();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            String s = scan.next();
            long result = stringConstruction(s);
            System.out.println(result);
        }
        scan.close();
    }
}
