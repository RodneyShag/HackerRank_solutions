// github.com/RodneyShag

/*
 * For your reference:
 *
 * DoublyLinkedListNode {
 *     int data;
 *     DoublyLinkedListNode next;
 *     DoublyLinkedListNode prev;
 * }
 *
 */

//  Time Complexity: O(n)
// Space Complexity: O(1)
DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
    if (head == null || head.next == null) {
        return head;
    }
    DoublyLinkedListNode prev = null;
    DoublyLinkedListNode curr = head;
    DoublyLinkedListNode next = null;
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next;
    }
    return prev;
}

// Discuss on HackerRank: https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/forum/comments/255770
