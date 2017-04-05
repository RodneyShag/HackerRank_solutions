//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/* 
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void preOrder(Node n) {
    if (n != null) {
        System.out.print(n.data + " ");
        preOrder(n.left);
        preOrder(n.right);
    }
}
