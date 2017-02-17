//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

public static Node insert(Node head, int data) {
    if (head == null) {
        return new Node(data);
    } else {
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node(data);
        return head;
    }
}
