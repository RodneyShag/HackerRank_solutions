//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.io.*;
import java.util.*;

class Node {
    Node left, right;
    int data;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {
    static void levelOrder(Node root){
        ArrayDeque<Node> deque = new ArrayDeque<>(); // use deque as a queue
        if (root != null) {
            deque.add(root);
        }
        while (!deque.isEmpty()) {
            Node n = deque.remove();
            System.out.print(n.data + " ");
            if (n.left != null) {
                deque.add(n.left);
            }
            if (n.right != null) {
                deque.add(n.right);
            }
        }
    }

    public static Node insert(Node root,int data){
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            }
            else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }   
}
