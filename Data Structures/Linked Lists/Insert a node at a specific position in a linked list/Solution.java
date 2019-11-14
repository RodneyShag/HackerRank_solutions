// github.com/RodneyShag

/*
  Insert Node at a given position in a linked list 

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
        Node n = head;
        for (int i = 0; i < position - 1; i++) {
            n = n.next;
        }
        
        /* Insert our new Node */
        newNode.next = n.next;
        n.next = newNode;
        
        return head;
    }
}
