//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/* Hidden stub code will pass a root argument to the function below. 

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
     
boolean checkBST(Node root) {
    return checkBST(root, 0, 10000); // range of values in problem
}

boolean checkBST(Node node, int min, int max) {
    if (node == null) {
        return true;
    } else if (node.data < min || node.data > max) {
        return false;
    }
    return checkBST(node.left, min, node.data - 1) && checkBST(node.right, node.data + 1, max);
}
