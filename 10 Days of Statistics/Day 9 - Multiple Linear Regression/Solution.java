//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        /* Read input: Create and fill X,Y arrays */
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        double [][] X = new double[n][m + 1];
        double [][] Y   = new double[n][1];
        for (int row = 0; row < n; row++) {
            X[row][0] = 1;
            for (int col = 1; col <= m; col++) {
                X[row][col] = scan.nextDouble();
            }
            Y[row][0] = scan.nextDouble();
        }

        /* Calculate B */
        double [][] xtx    = multiply(transpose(X),X);
        double [][] xtxInv = invert(xtx);
        double [][] xty    = multiply(transpose(X), Y);
        double [][] B      = multiply(xtxInv, xty);
        
        int sizeB = B.length;
        
        /* Calculate and print values for the "q" feature sets */
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            double result = B[0][0];
            for (int row = 1; row < sizeB; row++) {
                result += scan.nextDouble() * B[row][0];
            }
            System.out.println(result);
        }
    }
    
    /* Multiplies 2 matrices in O(n^3) time */
    public static double[][] multiply(double [][] A, double [][] B) {
        int aRows = A.length;
        int aCols = A[0].length;
        int bRows = B.length;
        int bCols = B[0].length;
        
        double [][] C = new double[aRows][bCols];
        int cRows = C.length;
        int cCols = C[0].length;
        
        for (int row = 0; row < cRows; row++) {
            for (int col = 0; col < cCols; col++) {
                for (int k = 0; k < aCols; k++) {
                    C[row][col] += A[row][k] * B[k][col];
                }
            }
        }
        return C;
    }
    
    public static double[][] transpose(double [][] matrix) {
        /* Create new array with switched dimensions */
        int originalRows = matrix.length;
        int originalCols = matrix[0].length;
        int rows = originalCols;
        int cols = originalRows;
        double [][] result = new double[rows][cols];
        
        /* Fill our new 2D array */
        for (int row = 0; row < originalRows; row++) {
            for (int col = 0; col < originalCols; col++) {
                result[col][row] = matrix[row][col];
            }
        }
        return result;
    }
    
    /******************************************************************/
    /* Matrix Inversion code (the 2 functions below) are from:        */
    /*   http://www.sanfoundry.com/java-program-find-inverse-matrix/  */
    /******************************************************************/

    public static double[][] invert(double a[][]) 
    {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i=0; i<n; ++i) 
            b[i][i] = 1;
 
         // Transform the matrix into an upper triangle
        gaussian(a, index);
 
         // Update the matrix b[i][j] with the ratios stored
        for (int i=0; i<n-1; ++i)
            for (int j=i+1; j<n; ++j)
                for (int k=0; k<n; ++k)
                    b[index[j]][k]
                            -= a[index[j]][i]*b[index[i]][k];
 
         // Perform backward substitutions
        for (int i=0; i<n; ++i) 
        {
            x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
            for (int j=n-2; j>=0; --j) 
            {
                x[j][i] = b[index[j]][i];
                for (int k=j+1; k<n; ++k) 
                {
                    x[j][i] -= a[index[j]][k]*x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        return x;
    }
 
        // Method to carry out the partial-pivoting Gaussian
        // elimination.  Here index[] stores pivoting order.
 
    public static void gaussian(double a[][], int index[]) 
    {
        int n = index.length;
        double c[] = new double[n];
 
         // Initialize the index
        for (int i=0; i<n; ++i) 
            index[i] = i;
 
         // Find the rescaling factors, one from each row
        for (int i=0; i<n; ++i) 
        {
            double c1 = 0;
            for (int j=0; j<n; ++j) 
            {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) c1 = c0;
            }
            c[i] = c1;
        }
 
         // Search the pivoting element from each column
        int k = 0;
        for (int j=0; j<n-1; ++j) 
        {
            double pi1 = 0;
            for (int i=j; i<n; ++i) 
            {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) 
                {
                    pi1 = pi0;
                    k = i;
                }
            }
 
           // Interchange rows according to the pivoting order
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i=j+1; i<n; ++i)   
            {
                double pj = a[index[i]][j]/a[index[j]][j];
 
                 // Record pivoting ratios below the diagonal
                a[index[i]][j] = pj;
 
                 // Modify other elements accordingly
                for (int l=j+1; l<n; ++l)
                    a[index[i]][l] -= pj*a[index[j]][l];
            }
        }
    }
}
