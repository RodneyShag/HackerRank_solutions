//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    
    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        String magazine[] = new String[m];
        for (int magazine_i = 0; magazine_i < m; magazine_i++) {
            magazine[magazine_i] = scan.next();
        }
        String ransom[] = new String[n];
        for (int ransom_i = 0; ransom_i < n; ransom_i++) {
            ransom[ransom_i] = scan.next();
        }
        scan.close();
        
        /* Attempt to create a ransom letter */
        if (magazine.length < ransom.length) {
            System.out.println("No");
        } else {
            canCreate(magazine, ransom);
        }
    }
    
    /* Determines if ransom letter can be made from magazine */
    public static void canCreate(String [] magazine, String [] ransom) {
        HashMap<String, Integer> usableWords = makeMap(magazine);
        
        for (int i = 0; i < ransom.length; i++) {
            if (usableWords.containsKey(ransom[i]) && usableWords.get(ransom[i]) > 0) {
                usableWords.put(ransom[i], usableWords.get(ransom[i]) - 1); // uses the word
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
    
    /* Makes HashMap out of an array of Strings */
    private static HashMap<String, Integer> makeMap(String [] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                map.put(words[i], map.get(words[i]) + 1);
            } else {
                map.put(words[i], 1);
            }
        }
        return map;
    }
}
