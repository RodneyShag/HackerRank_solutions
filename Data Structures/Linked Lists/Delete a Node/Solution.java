//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/ 

Node Delete(Node head, int position) {
    if (head == null) {
        return null;
    } else if (position == 0) {
        return head.next;
    } else {
        Node n = head;
        for (int i = 0; i < position - 1; i++) {
            n = n.next;
        }
        n.next = n.next.next;
        return head;
    }
}
