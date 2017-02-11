import java.util.Scanner;
import java.util.Stack;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') { // makes sure not to call .pop() on an empty stack
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = scan.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
