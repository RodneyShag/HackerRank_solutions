// github.com/RodneyShag

import java.util.Scanner;

// Main trick: Repesent our tree as a 1-D array

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
        while (T-- > 0) {
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
    
    private static void swap(Pair [] array, int depthToSwap, int currIndex, int currDepth) {
        if (currIndex < 1) {
            return;
        }
        Pair p = array[currIndex];
        if (currDepth == depthToSwap) {
            p.swapSubtrees();
        } else {
            swap(array, depthToSwap, p.left,  currDepth + 1);
            swap(array, depthToSwap, p.right, currDepth + 1);
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
