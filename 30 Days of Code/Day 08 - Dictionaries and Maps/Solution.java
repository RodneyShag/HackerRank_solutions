// github.com/RodneyShag

import java.util.Scanner;
import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        /* Save input as entries in a HashMap */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<String, Integer> map = new HashMap();
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            int phone   = scan.nextInt();
            map.put(name, phone);
        }
        
        /* Read each query and check if its in our HashMap */
        while (scan.hasNext()) {
            String str = scan.next();
            if (map.containsKey(str)) {
                System.out.println(str + "=" + map.get(str));
            } else {
                System.out.println("Not found");
            }
        }
        
        scan.close();
    }
}
