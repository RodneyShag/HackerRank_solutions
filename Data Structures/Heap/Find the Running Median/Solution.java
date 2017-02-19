//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;

/*
   We want either 
      1) maxHeap.size() == minHeap.size()
      2) maxHeap.size() - 1 = minHeap.size()
   to always be true
 */
public class Solution {

    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();                           // keeps track of the LARGE numbers
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // keeps track of the SMALL numbers
    
    public static void main(String[] args) {
        /* Read input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int a_i=0; a_i < n; a_i++) {
            a[a_i] = scan.nextInt();
        }
        scan.close();

        medianTracker(a);
    }
    
    public static void medianTracker(int [] array) {
        for (int i = 0; i < array.length; i++) {
            addNumber(array[i]);
            System.out.println(getMedian());
        }
    }
    
    private static void addNumber(int num) {
        if (maxHeap.isEmpty()) {
            maxHeap.add(num);
        }
        else if (maxHeap.size() == minHeap.size()) {
            if (num > maxHeap.peek()) {
                minHeap.add(num);
                maxHeap.add(minHeap.remove());
            }
            else {
                maxHeap.add(num);
            }
        }
        else if (maxHeap.size() > minHeap.size()) {
            if (num > maxHeap.peek()) {
                minHeap.add(num);
            }
            else {
                maxHeap.add(num);
                minHeap.add(maxHeap.remove());
            }
        }
        // Note: maxHeap will never be smaller size than minHeap
    }
    
    private static double getMedian() { // problem statement said: will always have at least 1 element
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }
        else { // same size
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }
}
