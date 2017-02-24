//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.util.*;
import java.security.*;

public class Solution {
    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
             
            /* Here are 3 ways to convert an int to a String */
            // String s = String.valueOf(n);
            // String s = Integer.toString(n);
            String s = "" + n;

            if (n == Integer.parseInt(s)) {
              System.out.println("Good job");
            } else {
              System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
              System.out.println("Unsuccessful Termination!!");
        }
    }
}

// The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {
    public static class ExitTrappedException extends SecurityException {
        private static final long serialVersionUID = 1;
    }
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
            if (permission.getName().contains("exitVM")) {
                throw new ExitTrappedException();
            }
        }
    };
    System.setSecurityManager(securityManager);
    }
}
