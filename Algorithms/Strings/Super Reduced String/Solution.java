//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.Stack;

//  Time Complexity: O(n)
// Space Complexity: O(n)

// Can alternatively use an ArrayDeque instead of a Stack. Just make sure to iterate
// through it properly since iteration order is opposite that of a Stack.

public class Solution {
    public static void main(String [] args) {
        /* Save input */
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
