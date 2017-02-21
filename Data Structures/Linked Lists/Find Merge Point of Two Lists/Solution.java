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

// Create a pointer that iterates through a list. When it's at the end
// of the list, have it jump to the beginning of the other list. Create
// 2 of these pointers, pointing to 2 different list heads. The pointers  
// will collide at the merge point after 1 or 2 passes.
//
//          Runtime: O(n)
// Space Complexity: O(1)
int FindMergeNode(Node headA, Node headB) {
    Node currA = headA;
    Node currB = headB;
    
    while (currA != currB) {
        if (currA.next == null) {
            currA = headB;
        } else {
            currA = currA.next;
        }
        
        if (currB.next == null) {
            currB = headA;
        } else {
            currB = currB.next;
        }
    }
    return currA.data;
}