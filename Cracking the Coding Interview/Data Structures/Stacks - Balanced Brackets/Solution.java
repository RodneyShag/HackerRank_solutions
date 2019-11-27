// github.com/RodneyShag

// ArrayDeque is "likely to be faster than Stack when used as a stack" - Java documentation

//  Time Complexity: O(n)
// Space Complexity: O(n)

/* Create HashMap to match opening brackets with closing brackets */
static String isBalanced(String expression) {
    HashMap<Character, Character> map = new HashMap();
    map.put('(', ')');
    map.put('[', ']');
    map.put('{', '}');
    return isBalanced(expression, map) ? "YES" : "NO";
}

private static boolean isBalanced(String expression, HashMap<Character, Character> map) {
    if ((expression.length() % 2) != 0) {
        return false; // odd length Strings are not balanced
    }        
    ArrayDeque<Character> deque = new ArrayDeque(); // use deque as a stack
    for (int i = 0; i < expression.length(); i++) {
        Character ch = expression.charAt(i);
        if (map.containsKey(ch)) {
            deque.push(ch);
        } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
            return false;
        }
    }
    return deque.isEmpty();
}
