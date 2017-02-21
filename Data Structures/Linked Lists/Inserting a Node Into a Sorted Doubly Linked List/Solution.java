//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/*
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

//          Runtime: O(n)
// Space Complexity: O(1)
Node SortedInsert(Node head, int data) {
    /* Create Node to insert */
    Node newNode = new Node();
    newNode.data = data;
    
    if (head == null) { // insert in empty list
        return newNode;
    } else if (data < head.data) { // insert in front of list
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    } else {
        /* Walk list with 2 pointers */
        Node n1 = null;
        Node n2 = head;
        while (n2 != null && n2.data < data) {
            n1 = n2;
            n2 = n2.next;
        }
        
        if (n2 == null) { // insert at end of list
            n1.next = newNode;
            newNode.prev = n1;
        } else { // insert in empty list
            n1.next = newNode;
            n2.prev = newNode;
            newNode.prev = n1;
            newNode.next = n2;
        }
        return head;
    }
}
