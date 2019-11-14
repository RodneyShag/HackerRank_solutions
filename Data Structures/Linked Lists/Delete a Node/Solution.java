// github.com/RodneyShag

/*
  Delete Node at a given position in a linked list 

  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/ 

Node Delete(Node head, int position) {
    if (head == null) {
        return null;
    } else if (position == 0) {
        return head.next;
    } else {
        /* Get Node one element before desired position */
        Node n = head;
        for (int i = 0; i < position - 1; i++) {
            n = n.next;
        }
        /* Delete Node */
        n.next = n.next.next;
        
        return head;
    }
}
