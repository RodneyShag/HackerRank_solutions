import java.util.Scanner;
import java.util.HashMap;

/* Runtime: O(n) using HashMap */
public class Solution {

    public static void buyIceCream(int [] costs, int money) {
        HashMap<Integer, Integer> map = new HashMap<>(); // key = cost, value = ice cream ID

        for (int i = 0; i < costs.length; i++) {
            int icecreamID = i + 1;
            int cost       = costs[i];
            int otherCost  = money - cost;
            
            /* Find 2 flavors to buy that sum to "money" */
            if (map.containsKey(otherCost)) {
                System.out.println(map.get(otherCost) + " " + icecreamID);
            }
            
            /* Update HashMap */
            if ( ! map.containsKey(cost)) {
                map.put(cost, icecreamID);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = scan.nextInt();
            int n = scan.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++) {
                a[a_i] = scan.nextInt();
            }
            
            buyIceCream(a, m);
        }
        scan.close();
    }
}
