//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
Node InsertNth(Node head, int data, int position) {
    Node newNode = new Node();
    newNode.data = data;
    
    if (position == 0) {
        newNode.next = head;
        return newNode;
    } else {
        /* Get Node one element before desired position */
        Node curr = head;
        for (int i = 0; i < position - 1; i++) {
            curr = curr.next;
        }
        
        /* Insert our new Node */
        newNode.next = curr.next;
        curr.next = newNode;
        
        return head;
    }
}
