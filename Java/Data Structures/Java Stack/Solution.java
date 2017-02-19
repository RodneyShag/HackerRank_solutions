//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.Stack;
import java.util.HashMap;

class Solution {
    
    public static void main(String[] args) {
        /* Create HashMap to match opening brackets with closing brackets */
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        /* Test each expression for validity */
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(isBalanced(expression, map) ? "true" : "false" );
        }
        scan.close();
    }
    
    public static boolean isBalanced(String expression, HashMap<Character, Character> map) {
        /* Odd length strings are not balanced */
        if ((expression.length() % 2) != 0) {
            return false;
        }
        
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) {
                stack.push(ch);
            } else if (stack.isEmpty() || ch != map.get(stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
