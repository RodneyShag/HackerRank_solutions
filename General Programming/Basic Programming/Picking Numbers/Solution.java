// Author: Rodney Shaghoulian
// Github: github.com/RodneyShag

// Algorithm: 
//  1 - Notice there is a special restriction on the range of values in the array: values are between 0 and 100.
//  2 - Since the order of elements in our array does not matter, we can just keep the counts of each number.
//  3 - Create a new 100-element "counts" array to store the counts of each number.
//  4 - In our "counts" array, the adjacent pair with the largest sum is our final solution.
//  5 - This is because the original numbers represented by the 2 adjacent slots in counts[] can be used to create a 
//      maximal solution

// Time complexity: O(n)

public static int pickingNumbers(List<Integer> array) {
    final int MAX_VALUE = 100;

    /* Save counts of each number */
    int[] counts = new int[MAX_VALUE];
    for (int num : array) {
        counts[num]++;
    }
    
    /* Find adjacent pair with largest sum */
    int max = 2;
    for (int i = 1; i < 100; i++) {
        int adjacentSum = counts[i] + counts[i-1];
        max = Math.max(max, adjacentSum);
    }
    return max;
}
