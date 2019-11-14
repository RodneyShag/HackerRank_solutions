// github.com/RodneyShag

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        System.out.println(alteredLetters(str));
    }

    private static int alteredLetters(String message) {
        String sos = "SOS";
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != sos.charAt(i % 3)) {
                count++;
            }
        }
        return count;
    }
}
