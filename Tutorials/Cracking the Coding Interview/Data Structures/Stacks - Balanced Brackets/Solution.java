import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++){
            Character ch = expression.charAt(i);
            switch (ch) {
                case '(': 
                case '[':
                case '{': stack.push(ch);
                          break;
                
                case ')': if (stack.isEmpty() || stack.pop() != '(')
                              return false;
                          break;
                
                case ']': if (stack.isEmpty() || stack.pop() != '[')
                              return false;
                          break;
                
                case '}': if (stack.isEmpty() || stack.pop() != '{')
                              return false;
                          break;
                
                default: break;
            }
        }
        return stack.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
