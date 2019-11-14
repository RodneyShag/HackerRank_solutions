// github.com/RodneyShag

/* Node is defined as :
    class Node {
        int data;
        Node left;
        Node right;
    }
*/

// Assumes tree has unique values.
// This problem is simpler since we're given a binary SEARCH tree.

//  Time Complexity: O(log n) on a balanced tree
// Space Complexity: O(1)
static Node lca(Node n, int v1, int v2) {
    while (n != null) {
        if (n.data > v1 && n.data > v2) {
            n = n.left;
        } else if (n.data < v1 && n.data < v2) {
            n = n.right;
        } else {
            break;
        } 
    }
    return n;
}
