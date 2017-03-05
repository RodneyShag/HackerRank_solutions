//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.Stack;

//          Runtime: O(n)
// Space Complexity: O(n)

public class Solution {
    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        
        /* Iterate through String, creating final result in a Stack */
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!stack.isEmpty() && ch == stack.peek()) {
                stack.pop(); // since String has 2 adjacent equal characters
            } else {
                stack.push(ch);
            }
        }
        
        /* Print final result */
        if (stack.isEmpty()) {
            System.out.println("Empty String");
        } else {
            for (char ch : stack) {
                System.out.print(ch);
            }
        }
    }
}
