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
        quickSort(array);
    }
    
    public static void quickSort(int [] array) {
        if (array != null) {
            quickSort(array, 0, array.length - 1);
        }
    }
    
    private static void quickSort(int [] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);
            printArray(array, 0, array.length - 1);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
        }
    }
    
    /* Must use "Lomuto Partition" scheme (which isn't very efficient) from Wikipedia:
       https://en.wikipedia.org/wiki/Quicksort#Lomuto_partition_scheme */
    private static int partition(int[] A, int lo, int hi) {
        int pivot = A[hi];
        int i = lo - 1;
        for (int j = lo; j <= hi - 1; j++) {
            if (A[j] <= pivot) {
                i++;
                swap(A, i , j);
            }
        }
        swap(A, i + 1, hi);
        return i + 1;
    }
    
    private static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    private static void printArray(int[] array, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
