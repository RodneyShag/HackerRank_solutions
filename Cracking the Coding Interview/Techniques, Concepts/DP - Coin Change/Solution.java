// github.com/RodneyShag

// Use a HashMap as a cache to speed up runtime 
// Must use "long" instead of "int" to avoid integer overflow

static long ways(int n, int[] coins) {
    if (n < 0) {
        return 0;
    }
    return numWays(n, coins, 0, new HashMap<String, Long>());
}
    
private static long numWays(int n, int [] coins, int coinNumber, HashMap<String, Long> cache) {
    /* Check our cache */
    String key = n + "," + coinNumber;
    if (cache.containsKey(key)) {
        return cache.get(key);
    }
    /* Base case */
    if (coinNumber == coins.length - 1) {
        if (n % coins[coinNumber] == 0) {
            cache.put(key, 1L);
            return 1;
        } else {
            cache.put(key, 0L);
            return 0;
        }
    }
    /* Recursive case */
    long ways = 0;
    for (int i = 0; i <= n; i += coins[coinNumber]) {
        ways += numWays(n - i, coins, coinNumber + 1, cache);
    }
    /* Cache and return solution */
    cache.put(key, ways);
    return ways;
}
