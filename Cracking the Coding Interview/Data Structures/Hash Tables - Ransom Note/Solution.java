// github.com/RodneyShag

/* Determines if ransom letter can be made from magazine */
public static void checkMagazine(String[] magazine, String[] ransom) {
    HashMap<String, Integer> usableWords = makeMap(magazine);
    for (int i = 0; i < ransom.length; i++) {
        if (usableWords.containsKey(ransom[i]) && usableWords.get(ransom[i]) > 0) {
            usableWords.merge(ransom[i], -1, Integer::sum); // uses the word
        } else {
            System.out.println("No");
            return;
        }
    }
    System.out.println("Yes");
}

/* Creates and returns a HashMap out of an array of Strings */
private static HashMap<String, Integer> makeMap(String[] words) {
    HashMap<String, Integer> map = new HashMap();
    for (int i = 0; i < words.length; i++) {
        map.merge(words[i], 1, Integer::sum);
    }
    return map;
}
