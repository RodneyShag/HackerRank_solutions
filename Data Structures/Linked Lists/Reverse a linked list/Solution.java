//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/

// Iterative Solution using 3 pointers
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
        curr.next = prev; // changes arrow direction
        prev = curr;
        curr = next;
    }
    return prev;
}
