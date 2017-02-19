//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.HashMap;

public class Solution {

    private static TrieNode root = new TrieNode();
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int a0 = 0; a0 < n; a0++) {
            String op = scan.next();
            String contact = scan.next();
            if (op.equals("add")) {
                add(contact);
            } else if (op.equals("find")) {
                System.out.println(find(contact));
            }
        }
        scan.close();
    }
    
    private static void add(String str) {
        TrieNode curr = root;
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            
            if ( ! curr.children.containsKey(ch)) {
                curr.addChild(ch);
            }
            curr = curr.children.get(ch);
            curr.size++; // each time we visit a node (while adding letters), we increment this.
        }
    }
    
    private static int find(String str) {
        TrieNode curr = root;
        
        /* Traverse down tree to end of our prefix */
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if ( ! curr.children.containsKey(ch)) {
                return 0;
            } else {
                curr = curr.children.get(ch);
            }
        }
        
        return curr.size;
    }
    
    /* This implementation is somewhat based off the tutorial video in this problem */
    public static class TrieNode {
        public HashMap<Character, TrieNode> children = new HashMap<>();
        public int size = 0; // this was the main trick to decrease runtime to pass tests.
        
        public void addChild(Character ch) {
            children.put(ch, new TrieNode());
        }
    }
}
