// github.com/RodneyShag

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
            int N = scan.nextInt();
            char [][] grid = new char[N][N];
            for (int i = 0; i < N; i++) {
                String str = scan.next();
                for (int j = 0; j < str.length(); j++) {
                    grid[i][j] = str.charAt(j);
                }
            }
            System.out.println(canConvert(grid) ? "YES" : "NO");
        }
        scan.close();
    }
    
    /* Uses Greedy Approach */
    private static boolean canConvert(char [][] grid) {
        /* Sort each row */
        int rows = grid.length;
        int cols = grid[0].length;
        for (int row = 0; row < rows; row++) {
            Arrays.sort(grid[row]);
        }
        
        /* Check columns for lexicographic ordering */
        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] < grid[row-1][col]) {
                    return false;
                }
            }
        }
        return true;
    }
}

