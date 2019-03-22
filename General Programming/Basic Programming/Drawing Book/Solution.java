// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;

// Explanation:
//   - The last page is n/2 page turns away.
//   - It takes p/2 pages to get to the p-th page (from the front)
//   - It takes n/2 - p/2 pages to get to the p-th page (from the back)
//   - The minimum of p/2 and (n/2 - p/2) is the minimum number of pages Brie must turn

//  Time complexity: O(1)
// Space complexity: O(1)
public class Solution {
    static int solve (int n, int p) {
        int pagesFromFront = p/2;
        int pagesFromBack  = n/2 - p/2;
        return Math.min(pagesFromFront, pagesFromBack);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        scan.close();
        
        int result = solve(n, p);
        System.out.println(result);
    }
}
