// github.com/RodneyShag

/*
  class SinglyLinkedListNode {
     int data;
     SinglyLinkedListNode next;
  }
*/

//  Time Complexity: O(n + m)
// Space Complexity: O(1)
  
static SinglyLinkedListNode mergeLists(SinglyLinkedListNode currA, SinglyLinkedListNode currB) {
    if (currA == null) {
        return currB;
    } else if (currB == null) {
        return currA;
    }
    
    SinglyLinkedListNode result = new SinglyLinkedListNode(0); // dummy/placeholder ListNode
    SinglyLinkedListNode n = result;
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

    return result.next;
}
