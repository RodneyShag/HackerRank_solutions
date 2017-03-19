//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.HashSet;

/*

We are given an increasing input sequence, so no duplicate values exist.

For each element in the sequence that we traverse, we save it in a HashSet. Let's call this element "k". 
Our HashSet needs to have 3 elements, which we'll call i, j, k, that create a "beautiful triplet" as explained in the problem statement. 
When we come across element "k", we check to see if our HashSet also has elements "i" and "j". 
This is done by noting that we need to have a[i] + 2*d == a[j] + d == a[k] to have a beautiful triplet.

Time  Complexity: O(n)
Space Complexity: O(n)

*/
public class Solution {
    public static void main(String[] args) {
        /* Initialize variables */
        HashSet<Integer> set = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        int size     = scan.nextInt();
        int d        = scan.nextInt();
        int count    = 0;

        /* Solve in 1 pass through values */
        for (int i = 0; i < size; i++) {
            int num = scan.nextInt();
            if (set.contains(num - d) && set.contains(num - 2 * d)) {
                count++;
            }
            set.add(num);
        }
        
        scan.close();
        System.out.println(count);
    }
}
