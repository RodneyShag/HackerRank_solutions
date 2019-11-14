// github.com/RodneyShag

/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

//  Time Complexity: O(n)
// Space Complexity: O(1)
int getNode(SinglyLinkedListNode head, int positionFromTail) {
    SinglyLinkedListNode curr   = head;
    SinglyLinkedListNode runner = head;
    
    /* Move runner into the list by k elements */
    for (int i = 0; i < positionFromTail; i++) {
        runner = runner.next;
    }
    
    /* Move both pointers */
    while (runner.next != null) {
        curr   = curr.next;
        runner = runner.next;
    }
    
    return curr.data;
}
