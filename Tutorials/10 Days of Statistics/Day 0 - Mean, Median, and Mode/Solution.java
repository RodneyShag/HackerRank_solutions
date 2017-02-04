import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        /* Runtime: I solve it in O(n) using 2 passes of the data. I could optionally combine it into
                    1 pass but then code will be less clear */
        
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        scan.nextLine(); // gets rid of newline
        
        /* Create and fill array */
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        
        /* Mean */
        int total = 0;
        for (int num : array) {
            total += num;
        }
        double mean = (double) total / size;
        
        /* Median */
        double median;
        if (size % 2 == 0) {
            median = (array[size/2 - 1] + array[size/2]) / 2.0;
        }
        else {
            median = array[size/2];
        }
        
        /* Mode */
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxOccurrences = 0;
        int mode = Integer.MAX_VALUE;
        
        for (int num : array) {
            /* Update occurrences for this number */
            int occurrences;
            if (map.containsKey(num))
                occurrences = map.get(num) + 1;
            else
                occurrences = 1;
            map.put(num, occurrences);
            
            /* Update our mode. If there's a tie, choose the smaller number */
            if (occurrences > maxOccurrences){
                maxOccurrences = occurrences;
                mode = num;
            }
            else if (occurrences == maxOccurrences && num < mode){
                maxOccurrences = occurrences;
                mode = num;
            }
        }

        /* Print results */
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
    }
}
