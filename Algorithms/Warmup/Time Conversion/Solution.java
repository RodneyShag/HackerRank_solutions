//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* Read and save input */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        int hours   = Integer.valueOf(str.substring(0,2));
        int minutes = Integer.valueOf(str.substring(3,5));
        int seconds = Integer.valueOf(str.substring(6,8));

        /* Convert to 24-hour format */
        if (str.substring(8, 10).equals("PM") && hours != 12) {
            hours += 12;
        } else if (str.substring(8, 10).equals("AM") && hours == 12) {
            hours = 0;
        }
        
        System.out.format("%02d:%02d:%02d", hours, minutes, seconds);        
    }
}
