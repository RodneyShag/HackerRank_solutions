// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

import java.util.Scanner;

// Idea: Loop through the array. For every person with an odd number of bread, we distribute 1 bread to current
//       person, and 1 bread to next person. If last person has odd number of bread, there is no solution.
//       Otherwise, everyone has even number of bread, and we print how much bread was distributed.

// Time Complexity: O(n)
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        giveBread(array);
    }
    
    static void giveBread(int[] array) {
        int breadGiven = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 1) {
                array[i]++;     // give bread to current person
                array[i+1]++;   // give bread to next person
                breadGiven+= 2;
            }
        }
        if (array[array.length - 1] % 2 == 1) {
            System.out.println("NO"); // Array has odd parity. No solution exists
        } else {
            System.out.println(breadGiven);
        }
    }
}
