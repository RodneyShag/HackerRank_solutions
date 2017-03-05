//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/* Node is defined as :
    class Node {
        int data;
        Node left;
        Node right;
    }
*/

// Assumes tree has unique values
//          Runtime: O(log n) on a balanced tree
// Space Complexity: O(1)
static Node lca(Node root, int v1, int v2) {
    while (root != null) {
        if (root.data > v1 && root.data > v2) {
            root = root.left;
        } else if (root.data < v1 && root.data < v2) {
            root = root.right;
        } else {
            break;
        } 
    }
    return root;
}
