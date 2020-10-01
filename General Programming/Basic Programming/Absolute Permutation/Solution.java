import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the absolutePermutation function below.
    static int[] absolutePermutation(int n, int k) {
        int a[] = new int[n];
        int find=1+k;
        Set<Integer> vector=new HashSet();
        for(int i=0;i<n;i++){
            if(!vector.contains((i+1)-k)&&(i+1-k)>0){
                a[i]=(i+1)-k;
                vector.add(a[i]);
            }  
            else if(!vector.contains((i+1)+k)&&(i+1)+k<=n){
                a[i]=(i+1)+k;
                vector.add(a[i]);
            }   
            else return null;
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] result = absolutePermutation(n, k);
            if(result==null){
                bufferedWriter.write("-1");
            }
            else{
                for (int i = 0; i < result.length; i++) {
                    bufferedWriter.write(String.valueOf(result[i]));

                    if (i != result.length - 1) {
                        bufferedWriter.write(" ");
                    }
                }
            }
            

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
