//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.Stack;

// All 3 queries (1:push, 2:delete, 3:print max) are all O(1) runtime
public class Solution {
    public static void main(String[] args) {
        Stack<Integer> stack    = new Stack<Integer>();
        Stack<Integer> maxStack = new Stack<Integer>(); // keeps track of maximums

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        for (int i = 0; i < N; i++) {
            int query = scan.nextInt();
            switch (query) {
                case 1:
                    int x = scan.nextInt();
                    stack.push(x);
                    if (maxStack.isEmpty() || x >= maxStack.peek()) {
                        maxStack.push(x);
                    }
                    break;
                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue == maxStack.peek()) {
                        maxStack.pop();
                    }
                    break;
                case 3:
                    System.out.println(maxStack.peek());
                    break;
                default:
                    break;
            }
        }        
        scan.close();
    }
}
