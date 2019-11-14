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
        insertIntoSorted(array);
    }
    
    public static void insertIntoSorted(int[] array) {
        int i = array.length - 1;
        int value = array[i];
        while (i >= 1 && array[i-1] > value) {
            array[i] = array[i-1];
            i--;
            printArray(array);
        }
        array[i] = value;
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
