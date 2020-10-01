// github.com/RodneyShag

import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int multiplier = Integer.parseInt(br.readLine());
       
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d x %d = %d%n", multiplier, i , i * multiplier);
        }
    }
}
