import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static TrieNode root = new TrieNode();
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if (op.equals("add"))
                add(contact);
            else if (op.equals("find"))
                System.out.println(find(contact));
        }
    }
    
    private static void add(String str) {
        TrieNode curr = root;
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            
            if ( ! curr.children.containsKey(ch)) {
                curr.addChild(ch);
            }
            curr = curr.children.get(ch);
            curr.wordsFromHere++; // each time we visit a node (while adding letters), we increment this.
        }
    }
    
    private static int find(String str) {
        TrieNode curr = root;
        
        /* Traverse down tree to end of our prefix */
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if ( ! curr.children.containsKey(ch)) {
                return 0;
            }
            else {
                curr = curr.children.get(ch);
            }
        }
        
        return curr.wordsFromHere;
    }
    
    /* This implementation is somewhat based off the lecture video in this problem */
    public static class TrieNode {
        public HashMap<Character, TrieNode> children = new HashMap<>();
        public int wordsFromHere = 0; // this was the main trick to decrease runtime to pass tests.
        
        public void addChild(Character ch) {
            children.put(ch, new TrieNode());
        }
    }
}
