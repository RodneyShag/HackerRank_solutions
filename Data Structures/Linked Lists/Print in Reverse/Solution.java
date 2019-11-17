// github.com/RodneyShag

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */

void reversePrint(SinglyLinkedListNode n) {
    if (n != null) {
        reversePrint(n.next);
        System.out.println(n.data);
    }
}

// Discuss on HackerRank: https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/forum/comments/255098
