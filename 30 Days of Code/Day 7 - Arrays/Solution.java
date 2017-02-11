import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Read and save input */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        
        /* Print elements in reverse order */
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
