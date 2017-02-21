//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

//          Runtime: O(n)
// Space Complexity: O(1)
Node MergeLists(Node currA, Node currB) {
    if (currA == null) {
        return currB;
    } else if (currB == null) {
        return currA;
    }
    
    /* Find new head pointer */
    Node head = null;
    if (currA.data < currB.data) {
        head = currA;
        currA = currA.next;
    } else {
        head = currB;
        currB = currB.next;
    }
    
    /* Build rest of list */
    Node n = head;
    while (currA != null && currB != null) {
        if (currA.data < currB.data) {
            n.next = currA;
            currA = currA.next;
        } else {
            n.next = currB;
            currB = currB.next;
        }
        n = n.next;
    }
    
    /* Attach the remaining elements */
    if (currA == null) {
        n.next = currB;
    } else {
        n.next = currA;
    }

    return head;
}
