// github.com/RodneyShag

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] array = new int[s];
        for (int i = 0; i < s; i++) {
            array[i] = scan.nextInt(); 
        }
        scan.close();
        insertionSort(array);
    }
    
    /* Task: Find bug in HackerRank's insertionSort function below */
    public static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int value = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > value) { // fixed bug on this line
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }
        printArray(A);
    }

    private static void printArray(int[] array) {
        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
