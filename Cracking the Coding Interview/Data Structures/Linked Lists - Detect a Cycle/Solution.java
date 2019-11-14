// github.com/RodneyShag

// Algorithm
//
// 1. Create a pointer that moves 1 step  at a time: 'slow'
// 2. Create a pointer that moves 2 steps at a time: 'fast'
// 3. If the Linked List has a cycle, 'slow' and 'fast' will collide.

/*

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

// If "slow" and "fast" collide, we must have a cycle
boolean hasCycle(Node head) {
    if (head == null) {
        return false;
    }
    
    Node slow = head; // moves 1 Node  at a time
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

//  Time Complexity: O(n)
// Space Complexity: O(1)
