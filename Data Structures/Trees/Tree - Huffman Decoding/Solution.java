//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/*  
    class Node {
        public int frequency; // the frequency of this tree
        public char data;
        public Node left, right;
    }
*/ 

void decode(String str, Node root) {
    Node n = root;
    for (int i = 0; i < str.length(); i++) {
        n = str.charAt(i) == '0' ? n.left : n.right;
        if (n.left == null && n.right == null) {
            System.out.print(n.data);
            n = root;
        } 
    }
}
