import java.io.*;
import java.util.*;

public class Solution {
    private static int swaps = 0;
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] =  scan.nextInt();
        }
        
        bubbleSort(array);
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[array.length-1]);
        
    }
    
    private static void bubbleSort(int [] array) { 
        if (array == null)
            return;
        
        boolean swapped = true;
        int endOffset = 0; // optimizes code
        while (swapped) {
            swapped = false;
            for (int i = 1; i < array.length - endOffset; i++) {
                if (array[i] < array[i-1]) {
                    swap(array, i, i-1);
                    swapped = true;
                }
            }
            endOffset++;
        }
    }
    
    private static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        swaps++;
    }
}
