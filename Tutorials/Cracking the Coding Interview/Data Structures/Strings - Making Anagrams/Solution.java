import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    private static final int numLetters = 26;
    
    public static int numberNeeded(String first, String second) {
        /* For each string, create an array of the count of each character */
        int [] array1 = createFilledArray(first);
        int [] array2 = createFilledArray(second);
        
        /* Count number of deletions we need to make the Strings anagrams of each other */
        int deletions = 0;
        for (int i = 0; i < numLetters; i++){
            deletions += Math.abs(array1[i] - array2[i]);
        }
        return deletions;
    }

    private static int [] createFilledArray(String str){
        int [] array = new int [numLetters];
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            array[ch - 'a']++;
        }
        return array;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
