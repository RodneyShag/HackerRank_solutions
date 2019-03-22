// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

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
