//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

class Difference {
    private int[] elements;
    public int maximumDifference;
    
    Difference (int [] elements) {
        this.elements = elements;
    }

    // O(n) runtime. O(1) space
    void computeDifference() {
        maximumDifference = 0;
        int min = elements[0];
        int max = elements[0];
        for (int num : elements) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        maximumDifference = max - min;
    }
} // End of Difference class
