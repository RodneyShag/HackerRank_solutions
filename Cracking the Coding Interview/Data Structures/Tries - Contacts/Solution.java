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
        for (int i = 0; i < n; i++) {
            String operation = scan.next();
            String contact   = scan.next();
            if (operation.equals("add")) {
                add(contact);
            } else if (operation.equals("find")) {
                System.out.println(find(contact));
            }
        }
        scan.close();
    }

    private static void add(String str) {
        TrieNode curr = root;
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            curr.addChildIfAbsent(ch);
            curr = curr.children.get(ch);
            curr.size++;
        }
    }

    private static int find(String prefix) {
        TrieNode curr = root;
        
        /* Traverse down tree to end of our prefix */
        for (int i = 0; i < prefix.length(); i++) {
            Character ch = prefix.charAt(i);
            if (!curr.children.containsKey(ch)) {
                return 0;
            } else {
                curr = curr.children.get(ch);
            }
        }
        return curr.size;
    }
    
    /* This implementation is somewhat based off the tutorial video in this problem */
    public static class TrieNode { // must be a nested class since it's "static"
        public HashMap<Character, TrieNode> children = new HashMap<>();
        public int size = 0; // this was the main trick to decrease runtime to pass tests.
        
        public void addChildIfAbsent(Character ch) {
            children.putIfAbsent(ch, new TrieNode());
        }
    }
}
