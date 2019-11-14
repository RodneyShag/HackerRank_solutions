// github.com/RodneyShag

import java.util.Scanner;

// Idea: - For each 010, we can flip it to 011, and count that as one "step".
//       - An easy way to count the number of steps is to change each 010 to 01 instead, 
//         and to compare the length of the resulting string with the original string

public class Solution {
    static int minSteps(String B) {
        return B.length() - B.replace("010","01").length();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.nextInt(); // we don't need "n"
        String B = scan.next();
        scan.close();
        
        System.out.println(minSteps(B));
    }
}
