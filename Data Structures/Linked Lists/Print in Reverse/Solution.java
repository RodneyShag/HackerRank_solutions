//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/*
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

void ReversePrint(Node n) {
    if (n != null) {
        ReversePrint(n.next);
        System.out.println(n.data);
    }
}
