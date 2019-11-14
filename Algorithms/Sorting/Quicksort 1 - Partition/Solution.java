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
        partition(array);
        printArray(array);
    }
    
    /* Partitions array into 2 parts. 
     *      1) Left side has values smaller than pivotValue
     *      2) Right side has values larger than pivotValue
     * Returns pivotIndex
     */
    public static int partition(int [] array) {
        int pivotIndex = 0; // not a great choice of pivot.
        int pivotValue = array[pivotIndex];
        
        swap(array, pivotIndex, array.length - 1); // put pivot at end for now.
        
        /* Linear search, comparing all elements to pivotValue and swapping as necessary */
        int indexToReturn = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < pivotValue){
                swap(array, i, indexToReturn);
                indexToReturn++;
            }
        }
        
        swap(array, indexToReturn, array.length - 1); // puts pivot where it belongs
        return indexToReturn;
    }
    
    private static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    private static void printArray(int[] array) {
        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
