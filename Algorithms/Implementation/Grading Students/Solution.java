//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n-- > 0) {
            int grade = scan.nextInt();
            System.out.println(roundGrade(grade));
        }
    }
    
    private static int roundGrade(int grade) {
        if (grade >= 38) {
            int gradeMod5 = grade % 5;
            if (gradeMod5 > 2) {
                grade += 5 - gradeMod5;
            }
        }
        return grade;
    }
}
