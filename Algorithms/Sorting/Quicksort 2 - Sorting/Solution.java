// github.com/RodneyShag

import java.util.Scanner;
import java.util.ArrayList;

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
        quickSort(array, 0, array.length - 1);
    }
    
    private static void quickSort(int [] array, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, end);
            printArray(array, start, end);
        }
    }
    
    /* Partition/Quicksort "Stable Sort" version using O(n) space */
    private static int partition(int[] array, int start, int end) {
        int pivotValue = array[start]; // not a great choice of pivot
        ArrayList<Integer> leftList  = new ArrayList();
        ArrayList<Integer> rightList = new ArrayList();

        for (int i = start + 1 ; i <= end; i++) {
            if (array[i] < pivotValue) {
                leftList.add(array[i]);
            } else {
                rightList.add(array[i]);
            }
        }
        
        /* Recreate array */
        copy(leftList, array, start);
        int newPivotIndex = start + leftList.size();
        array[newPivotIndex] = pivotValue;
        copy(rightList, array, newPivotIndex + 1);

        return newPivotIndex;
    }
    
    private static void copy(ArrayList<Integer> list, int [] array, int startIndex) {
        for (int num : list) {
            array[startIndex++] = num;
        }
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
