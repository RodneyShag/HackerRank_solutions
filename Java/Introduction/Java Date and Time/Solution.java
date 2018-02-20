//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.time.LocalDate;

public class Solution {
    public static String getDay(String day, String month, String year) {
        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);
        LocalDate date = LocalDate.of(y, m, d);
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day   = in.next();
        String year  = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}
