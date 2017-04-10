//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.util.BitSet;

public class Solution {
    private static final int NUM_ELEMENTS = 26;
    
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        
        /* Initialize BitSet */
        BitSet bitset = new BitSet(NUM_ELEMENTS);
        bitset.set(0, NUM_ELEMENTS);

        /* Create a BitSet for each rock. "AND" it with our original BitSet */
        for (int r = 0; r < N; r++) {
            String rock = scan.next();
            BitSet currBitSet = new BitSet(NUM_ELEMENTS);
            for (int i = 0; i < rock.length(); i++) {
                currBitSet.set(rock.charAt(i) - 'a');
            }
            bitset.and(currBitSet);
        }
        
        scan.close();
        System.out.println(bitset.cardinality());
    }
}
