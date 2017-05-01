//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;
import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        /* Read and save input as LocalDates */
        Scanner scan = new Scanner(System.in);
        LocalDate returnDate = readDate(scan);
        LocalDate expectDate = readDate(scan);
        scan.close();
        
        /* Calculate fine */
        int fine;
        if (returnDate.isEqual(expectDate) || returnDate.isBefore(expectDate)) {
            fine = 0;
        } else if (returnDate.getMonth() == expectDate.getMonth() && returnDate.getYear() == expectDate.getYear()) {
            fine = 15 * (returnDate.getDayOfMonth() - expectDate.getDayOfMonth());
        } else if (returnDate.getYear() == expectDate.getYear()) {
            fine = 500 * (returnDate.getMonthValue() - expectDate.getMonthValue());
        } else {
            fine = 10000;
        }
        System.out.println(fine);
    }
    
    private static LocalDate readDate(Scanner scan) {
        int day   = scan.nextInt();
        int month = scan.nextInt();
        int year  = scan.nextInt();
        return LocalDate.of(year, month, day);
    }
}
