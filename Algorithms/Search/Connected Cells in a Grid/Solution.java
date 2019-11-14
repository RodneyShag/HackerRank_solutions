// github.com/RodneyShag

import java.util.Scanner;
import java.util.ArrayList;

// Tips:
// - Instead of using a "boolean[][] visited" array, we alter our original grid
// - Dont create a 2-D "Point" or "Cell" class. It's not necessary.

public class Solution {
    private static int rows; // here for convenience
    private static int cols; // here for convenience
    
    public static void main(String[] args) {
        /* Save input grid */
        Scanner scan = new Scanner(System.in);
        rows = scan.nextInt();
        cols = scan.nextInt();
        int [][] grid = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                grid[row][col] = scan.nextInt();
            }
        }
        scan.close();

        System.out.println(largestRegion(grid));
    }
    
    /* Returns the size of the largest region */
    public static int largestRegion(int [][] grid) {
        int maxRegion = 0;
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                /* Find the largest region from the current cell */
                if (grid[row][col] == 1) {
                    int size  = findLargestRegion(grid, row, col);
                    maxRegion = Math.max(maxRegion, size);
                }
            }
        }
        return maxRegion;
    }
    
    private static int findLargestRegion(int [][] grid, int row, int col) {
        /* Put boundary checks here (at top of recursive call), instead of before doing recursive call */
        if (row < 0 || row >= rows || col < 0 || col >= cols || grid == null || grid[row][col] == 0) {
            return 0;
        }

        grid[row][col] = 0; // we alter the original matrix here
        int size = 1;       // 1 accounts for our size
        
        /* Recursively search neighbors */
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                size += findLargestRegion(grid, r, c);
            }
        }

        return size;
    }
}
