// github.com/RodneyShag

// O(n) runtime. O(1) space. Uses XOR. Keep in mind:
//   1) x ^ x = 0
//   2) x ^ 0 = x
//   3) XOR is commutative and associative

int findLonely(List<Integer> array) {
    int val = 0;
    for (int num : array) {
        val = val ^ num; // ^ is XOR operator
    }
    return val;
}
