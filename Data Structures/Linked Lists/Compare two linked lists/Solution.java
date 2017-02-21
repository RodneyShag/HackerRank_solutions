//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

//          Runtime: O(n)
// Space Complexity: O(1)
int CompareLists(Node n1, Node n2) {
    if (n1 == null && n2 == null) {
        return 1;
    }
    while (n1 != null && n2 != null) {
        if (n1.data != n2.data) {
            return 0;
        }
        n1 = n1.next;
        n2 = n2.next;
    }
    return (n1 == null && n2 == null) ? 1 : 0;
}
