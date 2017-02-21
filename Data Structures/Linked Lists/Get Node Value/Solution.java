//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

//          Runtime: O(n)
// Space Complexity: O(1)
int GetNode(Node head, int k) {
    Node curr   = head;
    Node runner = head;
    
    /* Move runner into the list by k elements */
    for (int i = 0; i < k; i++) {
        runner = runner.next;
    }
    
    /* Move both pointers */
    while (runner.next != null) {
        curr = curr.next;
        runner = runner.next;
    }
    
    return curr.data;
}
