// github.com/RodneyShag

// Iterative Solution using 3 pointers
//  Time Complexity: O(n)
// Space Complexity: O(1)

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */

static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
    SinglyLinkedListNode prev = null;
    SinglyLinkedListNode curr = head;
    SinglyLinkedListNode next = null;
    while (curr != null) {
        next = curr.next;
        curr.next = prev; // changes arrow direction
        prev = curr;
        curr = next;
    }
    return prev;
}
