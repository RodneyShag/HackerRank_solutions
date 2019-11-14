// github.com/RodneyShag

import java.util.Scanner;

public class Solution {
    
    private static int swaps = 0; // counts swaps in quickSort

    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] array = new int[s];
        for (int i = 0; i < s; i++) {
            array[i] = scan.nextInt(); 
        }
        scan.close();
        
        /* Count shifts, swaps */
        int[] array2 = array.clone(); // save a copy before we sort it
        int shifts = insertionSortShifts(array);
        quickSort(array2);
        
        System.out.println(shifts - swaps);
    }
    
    public static int insertionSortShifts(int[] array) {
        int shifts = 0;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int value = array[i];
            while (j >= 1 && array[j-1] > value) { // find where to insert "value"
                array[j] = array[j-1];             // shift elements (1 by 1) to make room for inserting
                j--;
                shifts++;
            }
            array[j] = value;
        }
        return shifts;
    }
    
    public static void quickSort(int [] array) {
        quickSort(array, 0, array.length - 1);
    }
    
    private static void quickSort(int [] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);
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
        swaps++;
    }
}
