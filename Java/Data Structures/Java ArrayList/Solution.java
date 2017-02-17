//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.ArrayList;

/* We need a 2-D array to solve this problem. We can't use an int[][] since we
   don't know the initial dimensions. So, we use ArrayList<ArrayList<Integer>> */
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
                
        /* Save numbers in 2-D ArrayList */
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            int d = scan.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int col = 0; col < d; col++) {
                numbers.add(scan.nextInt());
            }
            list.add(numbers);
        }
        
        /* Answer the queries */
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            try {
                int num = list.get(x-1).get(y-1);
                System.out.println(num);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        
        scan.close();        
    }
}
