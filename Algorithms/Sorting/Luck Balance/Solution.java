// github.com/RodneyShag

import java.util.Scanner;
import java.util.ArrayList;

// Algorithm: Lose every non-important contest to save luck. For important contests, lose the
// K contests with the most luck, and win the rest. This greedy algorithm maximizes saved luck.

//  Time Complexity: O(n) average-case runtime using Quickselect
// Space Complexity: O(n)

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        ArrayList<Integer> contest = new ArrayList(N);
        int savedLuck = 0;
        for (int i = 0; i < N; i++) {
            int luck = scan.nextInt();
            int importance = scan.nextInt();
            if (importance == 0) {
                savedLuck += luck; // lose every non-important contest
            } else {
                contest.add(luck);
            }
        }
        scan.close();
        
        /* Compete in "important" contests */
        quickselect(contest, contest.size() - K);
        for (int i = 0; i < contest.size(); i++) {
            if (i < contest.size() - K) {
                savedLuck -= contest.get(i); // win contest
            } else {
                savedLuck += contest.get(i); // lose contest
            }
        }
        System.out.println(savedLuck);
    }
    
    /* Quickselect 
     *  - Finds "nth" smallest element in a list. Returns its value (Code from Wikipedia)
     *  - Also partially sorts the data. If the value of the nth smallest element is x, all values to the
     *    left of it are smaller than x, and all values to the right of it are greater than x
     *  - O(n) average run-time is since we recurse only on 1 side (n + n/2 + n/4 + ...) = n (1 + 1/2 + 1/4 + ...) = O(n)
     *    Our formula above is a geometric series with "r = 1/2", which would converge to 1/(1-r) for infinite geometric series
     *  - O(n^2) worst-case run-time is if we consistently pick a bad pivot
     */
    private static Integer quickselect(ArrayList<Integer> list, int n) {
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int pivotIndex = partition(list, start, end);
            if (pivotIndex == n) {
                return list.get(n);
            } else if (pivotIndex < n) {
                start = pivotIndex + 1;
            } else {
                end = pivotIndex - 1;
            }
        }
        return null;
    }
    
    /* Partitions list into 2 parts. 
     *      1) Left side has values smaller than pivotValue
     *      2) Right side has values larger than pivotValue
     * Returns pivotIndex
     */
    public static int partition(ArrayList<Integer> list, int start, int end) {
        int pivotIndex = (start + end) / 2; // there are many ways to choose a pivot
        int pivotValue = list.get(pivotIndex);
        
        swap(list, pivotIndex, end); // puts pivot at end for now.
        
        /* Linear search, comparing all elements to pivotValue and swapping as necessary */
        int indexToReturn = start;  // Notice we set it to "start", not to "0".
        for (int i = start; i < end; i++) {
            if (list.get(i) < pivotValue) {
                swap(list, i, indexToReturn);
                indexToReturn++;
            }
        }
        
        swap(list, indexToReturn, end); // puts pivot where it belongs
        return indexToReturn;
    }
    
    private static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
