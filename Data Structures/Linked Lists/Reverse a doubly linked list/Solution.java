//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/*
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

//          Runtime: O(n)
// Space Complexity: O(1)
Node Reverse(Node head) {
    if (head == null && head.next == null) {
        return head;
    }
    Node prev = null;
    Node curr = head;
    Node next = null;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next;
    }
    return prev;
}
