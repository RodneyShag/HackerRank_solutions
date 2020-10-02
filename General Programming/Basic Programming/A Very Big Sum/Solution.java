import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        BigInteger sum=BigInteger.valueOf(0);
        for (int i = 0; i < size; i++) {
            int temporay=scan.nextInt();
            BigInteger temp=BigInteger.valueOf(temporay);
            sum=sum.add(temp);
        }
        scan.close();
        System.out.println(sum);
    }
}
