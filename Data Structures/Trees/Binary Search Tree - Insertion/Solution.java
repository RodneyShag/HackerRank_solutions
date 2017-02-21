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

//          Runtime: O(log n) on a balanced tree.
// Space Complexity: O(1)
static Node Insert(Node root, int value) {
    /* Create new Node */
    Node newNode = new Node();
    newNode.data = value;
    
    /* Special case: empty tree */
    if (root == null) {
        return newNode;
    }
    
    /* Iteratively walk tree and insert new Node */
    Node curr = root;
    while (true) {
        if (value <= curr.data) {
            if (curr.left == null) {
                curr.left = newNode;
                return root;
            } else {
                curr = curr.left;
            }
        } else {
            if (curr.right == null) {
                curr.right = newNode;
                return root;
            } else {
                curr = curr.right;
            }
        }
    }
}
