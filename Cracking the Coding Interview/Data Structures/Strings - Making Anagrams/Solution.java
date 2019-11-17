// github.com/RodneyShag

import java.util.Scanner;

public class Solution {
    private static final int NUM_LETTERS = 26; // we assume lower-case letters only
    
    private static int createFilledArray(String first, String second) {
        /* For each string, create an array of the count of each character */
        int [] array1 = createFilledArray(first);
        int [] array2 = createFilledArray(second);
        
        /* Count number of deletions we need to make the Strings anagrams of each other */
        int deletions = 0;
        for (int i = 0; i < NUM_LETTERS; i++) {
            deletions += Math.abs(array1[i] - array2[i]);
        }
        return deletions;
    }

    /* Creates an array with the count of each character */
    private static int [] createFilledArray(String str) {
        int [] array = new int[NUM_LETTERS];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            array[ch - 'a']++;
        }
        return array;
    }
}

// Discuss on HackerRank: https://www.hackerrank.com/challenges/ctci-making-anagrams/forum/comments/246741
