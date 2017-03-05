//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Create tree */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Pair [] array = new Pair[N+1]; // represents our tree
        for (int i = 1; i <= N; i++) {
            array[i] = new Pair(scan.nextInt(), scan.nextInt());
        }

        /* Perform swaps and print inorder traversals */
        int T = scan.nextInt();
        for (int i = 1; i <= T; i++) {
            int K = scan.nextInt();
            swap(array, K, N);
            inorderTraverse(array, 1);
            System.out.println();
        }
        scan.close();
    }
    
    private static void swap(Pair [] array, int K, int maxDepth) {
        for (int h = K; h <= maxDepth; h += K) {
            swap(array, h, 1, 1);
        }
    }
    
    private static void swap(Pair [] array, int depth, int currIndex, int currDepth) {
        if (currIndex < 1) {
            return;
        }
        Pair p = array[currIndex];
        if (currDepth == depth) {
            p.swapSubtrees();
        } else {
            swap(array, depth, p.left,  currDepth + 1);
            swap(array, depth, p.right, currDepth + 1);
        }
    }
    
    private static void inorderTraverse(Pair [] array, int index) {
        if (index != -1) {
            inorderTraverse(array, array[index].left);
            System.out.print(index + " ");
            inorderTraverse(array, array[index].right);        
        }
    }
}

class Pair {
    int left;
    int right;

    public Pair(int left, int right) {
        this.left  = left;
        this.right = right;
    }
    
    public void swapSubtrees() {
        int temp = left;
        left  = right;
        right = temp;
    }
}
