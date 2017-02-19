//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

/* If "slow" and "fast" collide, we must have a cycle */
boolean hasCycle(Node head) {
    if (head == null)
        return false;
    
    Node slow = head; // moves 1 Node at a time
    Node fast = head; // moves 2 Nodes at a time
    
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            return true; // since "slow" and "fast" collided
        }
    }
    return false;
}
