//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/* 
    class Node {
        int data;
        Node left;
        Node right;
    }
*/

void LevelOrder(Node root) {
    Queue<Node> queue = new LinkedList<>();
    if (root != null) {
        queue.add(root);
    }
    while ( ! queue.isEmpty()) {
        Node n = queue.remove();
        System.out.print(n.data + " ");
        if (n.left != null) {
            queue.add(n.left);
        }
        if (n.right != null) {
            queue.add(n.right);
        }
    }
}
