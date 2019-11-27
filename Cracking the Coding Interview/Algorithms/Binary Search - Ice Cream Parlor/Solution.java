// github.com/RodneyShag

import java.util.Scanner;
import java.util.HashMap;

//  Time Complexity: O(n)
// Space Complexity: O(n)
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int m = scan.nextInt();
            int n = scan.nextInt();
            int [] costs = new int[n];
            for (int i = 0; i < n; i++) {
                costs[i] = scan.nextInt();
            }
            buyIceCream(costs, m);
        }
        scan.close();
    }
    
    public static void buyIceCream(int [] costs, int money) {
        HashMap<Integer, Integer> map = new HashMap(); // key = cost, value = ice cream ID
        for (int i = 0; i < costs.length; i++) {
            int icecreamID = i + 1;
            int cost       = costs[i];
            
            /* Find 2 flavors to buy that sum to "money" */
            int otherCost  = money - cost;
            if (map.containsKey(otherCost)) {
                System.out.println(map.get(otherCost) + " " + icecreamID);
            }
            
            map.putIfAbsent(cost, icecreamID);
        }
    }
}
